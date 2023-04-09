package DAO;

import DTO.UserDTO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UserDAO {

    Connection conn;
    PreparedStatement pstm;

    public ResultSet authUser(UserDTO userDTO) {
        conn = new ConexaoDAO().conectaDB();

        try {
            String sql = "select * from user where email_user = ? and password_user = ?";
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, userDTO.getEmail_user());
            pstm.setString(2, userDTO.getPassword_user());
            
            ResultSet rs = pstm.executeQuery();
            return rs; 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + e.getMessage());
            return null;
        } 
    }

}
