package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Util {
    public static String geraHash(String password_user){
        String senhaHash = null;
        try {
            // Calcula o hash SHA-256 da senha
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password_user.getBytes("UTF-8"));

            // Converte o hash em uma representação de string hexadecimal
            senhaHash = Base64.getEncoder().encodeToString(hash);

        } catch (NoSuchAlgorithmException e) {
            // Lida com a exceção NoSuchAlgorithmException, se ocorrer
            System.err.println("Algoritmo de hash inválido: " + e.getMessage());

        } catch (UnsupportedEncodingException e) {
            // Lida com a exceção UnsupportedEncodingException, se ocorrer
            System.err.println("Codificação de caracteres inválida: " + e.getMessage());
        }
        return senhaHash;
    }
}
