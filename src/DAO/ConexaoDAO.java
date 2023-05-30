package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
        public Connection conectaDB(){
            Connection conn = null;
            try {
                String url = "jdbc:mysql://localhost:3306/dbmyshop?user=teste&password=teste@123456";
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return conn;
        }
        
        public Connection conectaDBSemDatabase() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/?user=teste&password=teste@123456";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
