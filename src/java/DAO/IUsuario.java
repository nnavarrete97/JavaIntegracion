/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.TipoUsuario;
import Entidades.Usuarios;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author nicomscr
 */
public interface IUsuario {
    
    public void agregar(Usuarios usuario,Connection con) throws Exception;
    
    public void agregarTipo(TipoUsuario tipoUsuario, Connection con) throws Exception;
    
    public List<Usuarios> listarUsuarios(Connection con) throws Exception;
    
    public void loginUsuario(String username, String pass,  Connection con) throws Exception;
    
}
