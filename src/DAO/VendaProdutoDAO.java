package DAO;

import DTO.VendaProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VendaProdutoDAO {
    Connection conn;
    PreparedStatement pstm;

    public void cadastrarVendaProduto(VendaProdutoDTO vendaProduto) {
        String sql = "INSERT INTO venda_produto(id_produto, id_venda, quantidade, preco_unitario) VALUES(?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vendaProduto.getIdProduto());
            pstm.setInt(2, vendaProduto.getIdVenda());
            pstm.setInt(3, vendaProduto.getQuantidade());
            pstm.setDouble(4, vendaProduto.getPrecoUnitario());

            int rowsAffected = pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
