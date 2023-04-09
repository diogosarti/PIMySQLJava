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
    
    public void cadastrarProduto(ProdutoDTO produto){
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
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ArrayList<ProdutoDTO> pesquisarProduto(){
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
}
