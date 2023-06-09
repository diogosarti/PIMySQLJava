package DAO;

import DTO.VendaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class VendaDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarVenda(VendaDTO venda) {
        String sql = "INSERT INTO venda(data_venda, valor_total) VALUES(?, ?)";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstm.setDate(1, new java.sql.Date(venda.getDataVenda().getTime()));
            pstm.setDouble(2, venda.getValorTotal());

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = pstm.getGeneratedKeys();
                if (rs.next()) {
                    venda.setIdVenda(rs.getInt(1));
                }
                JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma venda foi cadastrada");
            }
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public int obterNumeroTotalDeVendas() {
        String sql = "SELECT COUNT(*) FROM venda";
        conn = new ConexaoDAO().conectaDB();
        int totalVendas = 0;

        try {
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                totalVendas = rs.getInt(1);
            }
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalVendas;
    }

    public double obterValorTotalArrecadado() {
        String sql = "SELECT SUM(valor_total) FROM venda";
        conn = new ConexaoDAO().conectaDB();
        double totalArrecadado = 0.0;

        try {
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                totalArrecadado = rs.getDouble(1);
            }
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalArrecadado;
    }
}
