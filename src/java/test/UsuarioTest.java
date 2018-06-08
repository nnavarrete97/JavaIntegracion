/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import AES.AES;
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
        
//        Usuarios user = new Usuarios();
//        String password = "123";
//        final String secretKey = "AES";
//        String encryptedPass = AES.encrypt(password, secretKey);
//        user.setIdtipoUsuario(2);
//        user.setUsername("nico");
//        user.setPassword(encryptedPass);
        
        final String secretKey = "AES";
        String username = "nico";
        String password = "123";
        String encryptedPass = AES.encrypt(password, secretKey);
        
        String passfinal = AES.decrypt(encryptedPass, secretKey);
        
        
        
        
        
        
        
        try {
            //dao.agregar(user, new JavaConnectDb().getConnection());
            
            dao.loginUsuario(username, passfinal, new JavaConnectDb().getConnection());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
