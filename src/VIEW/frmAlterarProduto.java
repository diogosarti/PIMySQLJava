package VIEW;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import util.buttoms.somenteNumeros;

public class frmAlterarProduto extends javax.swing.JFrame {

    private int idProduto;

    public frmAlterarProduto(int idProduto) {
        initComponents();
        this.idProduto = idProduto;
        carregarDadosProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCadastrarProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblQtdeEstoque = new javax.swing.JLabel();
        btnAdicionar = new util.buttoms.MenuButton();
        txtQtdeEstoque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCadastrarProduto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastrarProduto.setForeground(new java.awt.Color(51, 51, 51));
        lblCadastrarProduto.setText("Editar Produto");
        jPanel1.add(lblCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 40));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Nome produto:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 390, 40));

        lblPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco.setText("Preço");
        jPanel1.add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 30));
        jPanel1.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 40));

        lblQtdeEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQtdeEstoque.setText("Qtde. Estoque");
        jPanel1.add(lblQtdeEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 130, 30));

        btnAdicionar.setText("Salvar alterações");
        btnAdicionar.setColorHover(new java.awt.Color(0, 153, 51));
        btnAdicionar.setColorNormal(new java.awt.Color(0, 204, 51));
        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        btnAdicionar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAdicionarKeyPressed(evt);
            }
        });
        jPanel1.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 390, 60));
        jPanel1.add(txtQtdeEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregarDadosProduto() {
        try {
            ProdutoDAO objProdutoDAO = new ProdutoDAO();
            ProdutoDTO objProdutoDTO = objProdutoDAO.obterProdutoPorId(idProduto);

            // Preencha os campos do formulário com os dados do produto
            // Exemplo:
            txtNome.setText(objProdutoDTO.getNomeProduto());
            txtPreco.setText(String.valueOf(objProdutoDTO.getPrecoProduto()));
            txtQtdeEstoque.setText(String.valueOf(objProdutoDTO.getQtdeEstoqueProduto()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do produto: " + e.getMessage());
        }
    }
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        atualizarPoduto();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAdicionarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAdicionarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizarPoduto();
        }
    }//GEN-LAST:event_btnAdicionarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int idProduto = 1;
                new frmAlterarProduto(idProduto).setVisible(true);
            }
        });
    }

    public void atualizarPoduto() {
        try {
            // Obtenha os novos valores dos campos de texto
            String novoNomeProduto = txtNome.getText();
            double novoPrecoProduto = Double.parseDouble(txtPreco.getText());
            int novaQtdeEstoque = Integer.parseInt(txtQtdeEstoque.getText());

            // Crie um objeto ProdutoDTO com os novos valores
            ProdutoDTO novoProdutoDTO = new ProdutoDTO();
            novoProdutoDTO.setIdPruduto(idProduto);
            novoProdutoDTO.setNomeProduto(novoNomeProduto);
            novoProdutoDTO.setPrecoProduto(novoPrecoProduto);
            novoProdutoDTO.setQtdeEstoqueProduto(novaQtdeEstoque);

            // Atualize o produto no banco de dados
            ProdutoDAO objProdutoDAO = new ProdutoDAO();
            objProdutoDAO.atualizarProduto(novoProdutoDTO);

            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");

            // Feche a janela de alteração
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o produto: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.buttoms.MenuButton btnAdicionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastrarProduto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtdeEstoque;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdeEstoque;
    // End of variables declaration//GEN-END:variables
}
