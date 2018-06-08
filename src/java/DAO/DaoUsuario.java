/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.TipoUsuario;
import Entidades.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicomscr
 */
public class DaoUsuario implements IUsuario {

    @Override
    public void agregar(Usuarios usuario, Connection con) throws Exception {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        //String llamadaProcedimiento = "{ call sp_agregar_trabajador(?, ?, ?) }";
        String sql = "{ call sp_agregar_usuarios(?, ?, ?) }";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, usuario.getUsername());
        pstmt.setString(2, usuario.getPassword());
        pstmt.setInt(3, usuario.getIdtipoUsuario());
        pstmt.execute();
        pstmt.close();

    }

    @Override
    public void agregarTipo(TipoUsuario tipoUsuario, Connection con) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public List<Usuarios> listarUsuarios(Connection con) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        List<Usuarios> lista = new ArrayList<>();

        //String llamadaProcedimiento = "{ call sp_agregar_trabajador(?, ?, ?) }";
        //SQL
        String sql = "{ call sp_listar_usuarios() }";

        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            lista.add(new Usuarios(rs.getBigDecimal("ID"), rs.getString("USERNAME"), rs.getString("PASSWORD")));
        }

        rs.close();
        pstmt.close();

        return lista;

    }

    @Override
    public void loginUsuario(String username, String pass,  Connection con) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         String sql = "SELECT * from USUARIOS WHERE USERNAME = ? and PASSWORD = ?";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, pass);
        pstmt.execute();
        pstmt.close();
        
    
    }

}
