/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import AES.AES;
import Entidades.Usuarios;
import com.JavaConnectDb;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import reglasDAO.UsuarioBO;

/**
 *
 * @author nicomscr
 *
 * El servlet es el puente de conexión entre los JSP y el Back-end extiende la
 * wea de HttpServlet
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //Para obtener registros
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       //lista
        List<Usuarios> lista = null;
        Connection con = null;
        
        try {
            con = JavaConnectDb.getInst().getConnection();
            //rescatamos la lista de la bdd
            lista = UsuarioBO.listar(con);
            //pasamos la lista al JSP
            request.setAttribute("lista", lista);
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(con !=null){
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            
            request.getRequestDispatcher("listar.jsp").forward(request, response);
        }

        
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //Para  inserción registros
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("txtUsername");
        String originalPass = request.getParameter("txtPassword");
        final String secretKey = "AES";
        String encryptedPass = AES.encrypt(originalPass, secretKey);
        
                
        //Parse
        int idTipoParse = 2;

        Usuarios user = new Usuarios(username, encryptedPass, idTipoParse);

        //Objeto conexión
        Connection con = null;

        try {
            con = JavaConnectDb.getInst().getConnection();
            //Llamar a BO para validar las reglas de negocio
            UsuarioBO.registro(user, con);
            
            request.setAttribute("tipoMensaje", "alert alert-success");
            request.setAttribute("msj", "Usuario registrado con éxito en la BD 1!");
            
            

        } catch (Exception e) {
             request.setAttribute("tipoMensaje", "alert alert-danger");
            request.setAttribute("msj", "Error al registrar al usuario en la BD 2!");
            e.printStackTrace();
           
        } finally {
            //Debemos cerrar el objeto conexión
            try {
                    if(con != null){
                        con.close();
                    }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            request.getRequestDispatcher("registro.jsp").forward(request, response);
        }
        
        
        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
