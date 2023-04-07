package VIEW;

import VIEW.Paineis.painelInicio;
import VIEW.Paineis.painelProduto;
import VIEW.Paineis.painelVenda;
import VIEW.paineis.mudarPainel;
import java.awt.Color;

public class frmPrincipalVIEW extends javax.swing.JFrame {

    public frmPrincipalVIEW() {
        initComponents();
        this.MenuButtonInicio.setSelected(true);
        
        new mudarPainel(pnPrincipal, new painelInicio());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MenuButtonInicio = new util.rsbuttom.MenuButton();
        MenuButtonVenda = new util.rsbuttom.MenuButton();
        MenuButtonProduto = new util.rsbuttom.MenuButton();
        MenuButtonSair = new util.rsbuttom.MenuButton();
        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gradient_1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        jPanel3.setBackground(new java.awt.Color(214, 217, 223));

        jPanel4.setBackground(new java.awt.Color(214, 217, 223));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(128, 128, 131));
        jLabel2.setText("Dashboard");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        MenuButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home_1.png"))); // NOI18N
        MenuButtonInicio.setText("Inicio");
        MenuButtonInicio.setToolTipText("");
        MenuButtonInicio.setColorHover(new java.awt.Color(204, 204, 204));
        MenuButtonInicio.setColorNormal(new java.awt.Color(204, 204, 204));
        MenuButtonInicio.setColorPressed(new java.awt.Color(204, 204, 204));
        MenuButtonInicio.setColorTextHover(new java.awt.Color(128, 128, 131));
        MenuButtonInicio.setColorTextNormal(new java.awt.Color(128, 128, 131));
        MenuButtonInicio.setColorTextPressed(new java.awt.Color(166, 166, 166));
        MenuButtonInicio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MenuButtonInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuButtonInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuButtonInicio.setIconTextGap(25);
        MenuButtonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuButtonInicioMousePressed(evt);
            }
        });
        MenuButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonInicioActionPerformed(evt);
            }
        });

        MenuButtonVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sale.png"))); // NOI18N
        MenuButtonVenda.setText("Venda");
        MenuButtonVenda.setToolTipText("");
        MenuButtonVenda.setColorHover(new java.awt.Color(153, 153, 153));
        MenuButtonVenda.setColorNormal(new java.awt.Color(214, 217, 223));
        MenuButtonVenda.setColorTextHover(new java.awt.Color(128, 128, 131));
        MenuButtonVenda.setColorTextNormal(new java.awt.Color(128, 128, 131));
        MenuButtonVenda.setColorTextPressed(new java.awt.Color(166, 166, 166));
        MenuButtonVenda.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MenuButtonVenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuButtonVenda.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuButtonVenda.setIconTextGap(25);
        MenuButtonVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuButtonVendaMousePressed(evt);
            }
        });
        MenuButtonVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonVendaActionPerformed(evt);
            }
        });

        MenuButtonProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product.png"))); // NOI18N
        MenuButtonProduto.setText("Produto");
        MenuButtonProduto.setToolTipText("");
        MenuButtonProduto.setColorHover(new java.awt.Color(153, 153, 153));
        MenuButtonProduto.setColorNormal(new java.awt.Color(214, 217, 223));
        MenuButtonProduto.setColorTextHover(new java.awt.Color(128, 128, 131));
        MenuButtonProduto.setColorTextNormal(new java.awt.Color(128, 128, 131));
        MenuButtonProduto.setColorTextPressed(new java.awt.Color(166, 166, 166));
        MenuButtonProduto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MenuButtonProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuButtonProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuButtonProduto.setIconTextGap(25);
        MenuButtonProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuButtonProdutoMousePressed(evt);
            }
        });
        MenuButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonProdutoActionPerformed(evt);
            }
        });

        MenuButtonSair.setBackground(new java.awt.Color(199, 8, 19));
        MenuButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        MenuButtonSair.setText("Sair");
        MenuButtonSair.setToolTipText("");
        MenuButtonSair.setColorHover(new java.awt.Color(255, 51, 51));
        MenuButtonSair.setColorNormal(new java.awt.Color(199, 8, 19));
        MenuButtonSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MenuButtonSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuButtonSair.setIconTextGap(25);
        MenuButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MenuButtonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MenuButtonVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MenuButtonProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MenuButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(MenuButtonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuButtonVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuButtonProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340)
                .addComponent(MenuButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 630));

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnPrincipal.setLayout(new javax.swing.BoxLayout(pnPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(pnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 1040, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuButtonSairActionPerformed

    private void MenuButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonInicioActionPerformed
        new mudarPainel(pnPrincipal, new painelInicio());
        if(!this.MenuButtonInicio.isSelected()){
            this.MenuButtonInicio.setColorNormal(new Color(204,204,204));
            this.MenuButtonInicio.setColorHover(new Color(204,204,204));
            this.MenuButtonInicio.setColorPressed(new Color(204,204,204));
            
            this.MenuButtonVenda.setColorNormal(new Color(214,217,223));
            this.MenuButtonVenda.setColorHover(new Color(214,217,223));
            this.MenuButtonVenda.setColorPressed(new Color(214,217,223));
            
            this.MenuButtonProduto.setColorNormal(new Color(214,217,223));
            this.MenuButtonProduto.setColorHover(new Color(214,217,223));
            this.MenuButtonProduto.setColorPressed(new Color(214,217,223));
        } else{
            this.MenuButtonInicio.setColorNormal(new Color(204,204,204));
            this.MenuButtonInicio.setColorHover(new Color(204,204,204));
            this.MenuButtonInicio.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_MenuButtonInicioActionPerformed

    private void MenuButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonProdutoActionPerformed
        new mudarPainel(pnPrincipal, new painelProduto());
        if(!this.MenuButtonInicio.isSelected()){
            this.MenuButtonInicio.setColorNormal(new Color(214,217,223));
            this.MenuButtonInicio.setColorHover(new Color(214,217,223));
            this.MenuButtonInicio.setColorPressed(new Color(214,217,223));
            
            this.MenuButtonVenda.setColorNormal(new Color(214,217,223));
            this.MenuButtonVenda.setColorHover(new Color(214,217,223));
            this.MenuButtonVenda.setColorPressed(new Color(214,217,223));
            
            this.MenuButtonProduto.setColorNormal(new Color(204,204,204));
            this.MenuButtonProduto.setColorHover(new Color(204,204,204));
            this.MenuButtonProduto.setColorPressed(new Color(204,204,204));
        } else{
            this.MenuButtonProduto.setColorNormal(new Color(204,204,204));
            this.MenuButtonProduto.setColorHover(new Color(204,204,204));
            this.MenuButtonProduto.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_MenuButtonProdutoActionPerformed

    private void MenuButtonVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonVendaActionPerformed
        new mudarPainel(pnPrincipal, new painelVenda());
        if(!this.MenuButtonVenda.isSelected()){
            this.MenuButtonInicio.setColorNormal(new Color(214,217,223));
            this.MenuButtonInicio.setColorHover(new Color(214,217,223));
            this.MenuButtonInicio.setColorPressed(new Color(214,217,223));
            
            this.MenuButtonVenda.setColorNormal(new Color(204,204,204));
            this.MenuButtonVenda.setColorHover(new Color(204,204,204));
            this.MenuButtonVenda.setColorPressed(new Color(204,204,204));
            
            this.MenuButtonProduto.setColorNormal(new Color(214,217,223));
            this.MenuButtonProduto.setColorHover(new Color(214,217,223));
            this.MenuButtonProduto.setColorPressed(new Color(214,217,223));
        } else{
            this.MenuButtonVenda.setColorNormal(new Color(204,204,204));
            this.MenuButtonVenda.setColorHover(new Color(204,204,204));
            this.MenuButtonVenda.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_MenuButtonVendaActionPerformed

    private void MenuButtonInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonInicioMousePressed
        this.MenuButtonInicio.setSelected(true);
        this.MenuButtonInicio.setSelected(false);
        this.MenuButtonProduto.setSelected(false);
    }//GEN-LAST:event_MenuButtonInicioMousePressed

    private void MenuButtonVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonVendaMousePressed
        this.MenuButtonInicio.setSelected(false);
        this.MenuButtonInicio.setSelected(true);
        this.MenuButtonProduto.setSelected(false);
    }//GEN-LAST:event_MenuButtonVendaMousePressed

    private void MenuButtonProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonProdutoMousePressed
        this.MenuButtonInicio.setSelected(false);
        this.MenuButtonInicio.setSelected(false);
        this.MenuButtonProduto.setSelected(true);
    }//GEN-LAST:event_MenuButtonProdutoMousePressed

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
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPrincipalVIEW().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.rsbuttom.MenuButton MenuButtonInicio;
    private util.rsbuttom.MenuButton MenuButtonProduto;
    private util.rsbuttom.MenuButton MenuButtonSair;
    private util.rsbuttom.MenuButton MenuButtonVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
