package VIEW.Paineis;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
import VIEW.frmAlterarProduto;
import VIEW.frmCadastrarPorduto;
import javax.swing.border.EmptyBorder;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.buttoms.ActionButton;
import util.buttoms.PanelAction;
import util.buttoms.TableActionCellRender;

public class painelProduto extends javax.swing.JPanel {

    frmCadastrarPorduto frmCadastro = null;

    public painelProduto() {
        initComponents();
        listarValoresProduto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRefreshProduct = new util.buttoms.MenuButton();
        btnAddProduct1 = new util.buttoms.MenuButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnRemoveProduct = new util.buttoms.MenuButton();
        btnEditProduct = new util.buttoms.MenuButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefreshProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        btnRefreshProduct.setColorHover(new java.awt.Color(0, 153, 255));
        btnRefreshProduct.setColorNormal(new java.awt.Color(0, 102, 204));
        btnRefreshProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefreshProduct.setIconTextGap(1);
        btnRefreshProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshProductActionPerformed(evt);
            }
        });
        add(btnRefreshProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 60));

        btnAddProduct1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addIcon1.png"))); // NOI18N
        btnAddProduct1.setText("Cadastrar Produto");
        btnAddProduct1.setColorHover(new java.awt.Color(51, 255, 0));
        btnAddProduct1.setColorNormal(new java.awt.Color(0, 204, 0));
        btnAddProduct1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddProduct1.setIconTextGap(1);
        btnAddProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProduct1ActionPerformed(evt);
            }
        });
        add(btnAddProduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 250, 60));

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço", "Qtde. Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setRowHeight(40);
        jScrollPane1.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 87, 970, 501));

        btnRemoveProduct.setBackground(new java.awt.Color(204, 0, 0));
        btnRemoveProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_1.png"))); // NOI18N
        btnRemoveProduct.setColorHover(new java.awt.Color(255, 0, 0));
        btnRemoveProduct.setColorNormal(new java.awt.Color(204, 0, 0));
        btnRemoveProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoveProduct.setIconTextGap(1);
        btnRemoveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveProductActionPerformed(evt);
            }
        });
        add(btnRemoveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 70, 60));

        btnEditProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editIcon.png"))); // NOI18N
        btnEditProduct.setColorHover(new java.awt.Color(204, 204, 0));
        btnEditProduct.setColorNormal(new java.awt.Color(255, 204, 0));
        btnEditProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditProduct.setIconTextGap(1);
        btnEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductActionPerformed(evt);
            }
        });
        add(btnEditProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 70, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshProductActionPerformed
        listarValoresProduto();
    }//GEN-LAST:event_btnRefreshProductActionPerformed

    private void btnAddProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProduct1ActionPerformed
        if (frmCadastro == null) {
            frmCadastro = new frmCadastrarPorduto();
            frmCadastro.setLocationRelativeTo(null);

        }
        frmCadastro.setVisible(true);


    }//GEN-LAST:event_btnAddProduct1ActionPerformed

    private void btnRemoveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProductActionPerformed
        // Remover o item selecionado na tabela
        int selectedRow = tabelaProdutos.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja remover o produto selecionado?", "Remover Produto", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int idProduto = (int) tabelaProdutos.getValueAt(selectedRow, 0);
                ProdutoDAO produto = new ProdutoDAO();
                try {
                    produto.removerProduto(idProduto);
                    listarValoresProduto();
                    JOptionPane.showMessageDialog(null, "Produto removido com sucesso.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover o produto: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para remover.");
        }
    }//GEN-LAST:event_btnRemoveProductActionPerformed

    private void btnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductActionPerformed
        int row = tabelaProdutos.getSelectedRow();

        if (row >= 0) {
            int idProduto = (int) tabelaProdutos.getValueAt(row, 0);

            // Criar instância do formulário de alteração
            frmAlterarProduto frmAlteracao = new frmAlterarProduto(idProduto);
            frmAlteracao.setLocationRelativeTo(null);

            // Exibir o formulário de alteração
            frmAlteracao.setVisible(true);

            // Atualizar a tabela após o formulário de alteração ser fechado
            frmAlteracao.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    listarValoresProduto();
                }
            });
        }

    }//GEN-LAST:event_btnEditProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.buttoms.MenuButton btnAddProduct1;
    private util.buttoms.MenuButton btnEditProduct;
    private util.buttoms.MenuButton btnRefreshProduct;
    private util.buttoms.MenuButton btnRemoveProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables

    private void listarValoresProduto() {
        try {
            ProdutoDAO objProduto = new ProdutoDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
            model.setNumRows(0);

            ArrayList<ProdutoDTO> lista = objProduto.pesquisarProduto();

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                    lista.get(i).getIdPruduto(),
                    lista.get(i).getNomeProduto(),
                    lista.get(i).getPrecoProduto(),
                    lista.get(i).getQtdeEstoqueProduto()
                });
            }

        } catch (Exception e) {
            JOptionPane.showInputDialog(null, e.getMessage());
        }
    }
}
