/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglasDAO;

import DAO.DaoUsuario;
import Entidades.TipoUsuario;
import Entidades.Usuarios;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author nicomscr
 */
public abstract class UsuarioBO {
    
    //Los metodos deben seguir los mismos parámetros que los DAO
    public static void registro(Usuarios usuario, Connection con) throws Exception{
        //regla de negocio
//        if(usuario.getUsername().length() <3){
//            throw new Exception("El nombre de contener más de 3 carácteres");
//        }
        new DaoUsuario().agregar(usuario, con);
    }
    
    public static List<Usuarios> listar (Connection con) throws Exception{
        return new DaoUsuario().listarUsuarios(con);
    }
    
    
    
}
