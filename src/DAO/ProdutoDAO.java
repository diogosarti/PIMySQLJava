package DAO;

import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

public class ProdutoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    ArrayList<ProdutoDTO> produtoLista = new ArrayList<>();

    public void cadastrarProduto(ProdutoDTO produto) {
        String sql = "insert into produto(nome_produto, preco_produto, qtdeEstoque_produto) values(?, ?, ?)";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, produto.getNomeProduto());
            pstm.setDouble(2, produto.getPrecoProduto());
            pstm.setInt(3, produto.getQtdeEstoqueProduto());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<ProdutoDTO> pesquisarProduto() {
        String sql = "select * from produto";
        conn = new ConexaoDAO().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                objProdutoDTO.setIdPruduto(rs.getInt("id_produto"));
                objProdutoDTO.setNomeProduto(rs.getString("nome_produto"));
                objProdutoDTO.setPrecoProduto(rs.getDouble("preco_produto"));
                objProdutoDTO.setQtdeEstoqueProduto(rs.getInt("qtdeEstoque_produto"));
                //objProdutoDTO.setIdFornecedorProduto(rs.getInt("idFornecedor_produto"));

                produtoLista.add(objProdutoDTO);
            }
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }

        return produtoLista;
    }

    public void atualizarEstoque(int idProduto, int quantidade) throws SQLException {
        String sql = "UPDATE produto SET qtdeEstoque_produto = qtdeEstoque_produto - ? WHERE id_produto = ?";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, quantidade);
            pstm.setInt(2, idProduto);

            int rowsAffected = pstm.executeUpdate();
            pstm.close();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Estoque atualizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum estoque foi atualizado");
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar o estoque: " + e.getMessage());
        }
    }

    public ProdutoDTO obterProdutoPorId(int idProduto) {
        String sql = "SELECT * FROM produto WHERE id_produto = ?";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idProduto);
            rs = pstm.executeQuery();

            if (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                objProdutoDTO.setIdPruduto(rs.getInt("id_produto"));
                objProdutoDTO.setNomeProduto(rs.getString("nome_produto"));
                objProdutoDTO.setPrecoProduto(rs.getDouble("preco_produto"));
                objProdutoDTO.setQtdeEstoqueProduto(rs.getInt("qtdeEstoque_produto"));
                // objProdutoDTO.setIdFornecedorProduto(rs.getInt("idFornecedor_produto"));

                return objProdutoDTO;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        return null;
    }

    public ProdutoDTO pesquisarProdutoPorNome(String nomeProduto) {
        String sql = "SELECT * FROM produto WHERE nome_produto = ?";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nomeProduto);
            rs = pstm.executeQuery();

            if (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                objProdutoDTO.setIdPruduto(rs.getInt("id_produto"));
                objProdutoDTO.setNomeProduto(rs.getString("nome_produto"));
                objProdutoDTO.setPrecoProduto(rs.getDouble("preco_produto"));
                objProdutoDTO.setQtdeEstoqueProduto(rs.getInt("qtdeEstoque_produto"));
                // objProdutoDTO.setIdFornecedorProduto(rs.getInt("idFornecedor_produto"));

                return objProdutoDTO;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        return null;
    }

    public void removerProduto(int idProduto) throws SQLException {
        String sql = "DELETE FROM produto WHERE id_produto = ?";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idProduto);

            int rowsAffected = pstm.executeUpdate();
            pstm.close();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum produto foi removido");
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao remover o produto: " + e.getMessage());
        }
    }

    public void atualizarProduto(ProdutoDTO produto) throws SQLException {
        String sql = "UPDATE produto SET nome_produto = ?, preco_produto = ?, qtdeEstoque_produto = ? WHERE id_produto = ?";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, produto.getNomeProduto());
            pstm.setDouble(2, produto.getPrecoProduto());
            pstm.setInt(3, produto.getQtdeEstoqueProduto());
            pstm.setInt(4, produto.getIdPruduto());

            int rowsAffected = pstm.executeUpdate();
            pstm.close();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum produto foi atualizado");
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar o produto: " + e.getMessage());
        }
    }

    public int obterNumeroTotalDeProdutosEmEstoque() {
        String sql = "SELECT SUM(qtdeEstoque_produto) FROM produto";
        conn = new ConexaoDAO().conectaDB();
        int totalEstoque = 0;

        try {
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                totalEstoque = rs.getInt(1);
            }
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalEstoque;
    }

    public int obterNumeroTotalDeProdutos() {
        String sql = "SELECT COUNT(*) FROM produto";
        conn = new ConexaoDAO().conectaDB();
        int totalProdutos = 0;

        try {
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                totalProdutos = rs.getInt(1);
            }
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalProdutos;
    }

}
