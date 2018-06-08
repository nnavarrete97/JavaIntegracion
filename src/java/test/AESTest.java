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
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author nicomscr
 */
public class AESTest {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
//        DaoUsuario dao = new DaoUsuario();

        final String secretKey = "AES";

        String originalString = "123";
        String encryptedString = AES.encrypt(originalString, secretKey);
        String decryptedString = AES.decrypt(encryptedString, secretKey);

        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);
    }
}
