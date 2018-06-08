/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.DaoUsuario;
import Entidades.Usuarios;
import com.JavaConnectDb;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicomscr
 */
public class UsuarioTest {
    
    
    public static void main(String[]args)
    {
        DaoUsuario dao = new DaoUsuario();
        
        Usuarios user = new Usuarios();
        
        user.setIdtipoUsuario(2);
        user.setUsername("holamundo");
        user.setPassword("1234");
        try {
            dao.agregar(user, new JavaConnectDb().getConnection());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
