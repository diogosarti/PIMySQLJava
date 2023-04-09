package VIEW.Paineis;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
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

        btnAddProduct = new util.buttoms.MenuButton();
        btnAddProduct1 = new util.buttoms.MenuButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnAddProduct2 = new util.buttoms.MenuButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        btnAddProduct.setColorHover(new java.awt.Color(0, 153, 255));
        btnAddProduct.setColorNormal(new java.awt.Color(0, 102, 204));
        btnAddProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddProduct.setIconTextGap(1);
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 60));

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
        add(btnAddProduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 250, 60));

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

        btnAddProduct2.setBackground(new java.awt.Color(204, 0, 0));
        btnAddProduct2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_1.png"))); // NOI18N
        btnAddProduct2.setColorHover(new java.awt.Color(255, 0, 0));
        btnAddProduct2.setColorNormal(new java.awt.Color(204, 0, 0));
        btnAddProduct2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddProduct2.setIconTextGap(1);
        btnAddProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProduct2ActionPerformed(evt);
            }
        });
        add(btnAddProduct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 70, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        listarValoresProduto();
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnAddProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProduct1ActionPerformed
        if(frmCadastro == null){
            frmCadastro = new frmCadastrarPorduto();
            frmCadastro.setLocationRelativeTo(null);
            
        }frmCadastro.setVisible(true);
    }//GEN-LAST:event_btnAddProduct1ActionPerformed

    private void btnAddProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProduct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddProduct2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.buttoms.MenuButton btnAddProduct;
    private util.buttoms.MenuButton btnAddProduct1;
    private util.buttoms.MenuButton btnAddProduct2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables

    private void listarValoresProduto(){
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
