package VIEW;

import DAO.InitDatabaseDAO;
import DAO.UserDAO;
import DTO.UserDTO;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import util.Util;

public class frmLoginVIEW extends javax.swing.JFrame {

    public frmLoginVIEW() {
        InitDatabaseDAO.init();
        initComponents();

    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnEntar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fulndo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setLayout(null);

        btnSair.setBackground(new java.awt.Color(199, 8, 19));
        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setToolTipText("");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(460, 560, 350, 59);

        btnEntar.setBackground(new java.awt.Color(0, 153, 153));
        btnEntar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEntar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntar.setText("Entrar");
        btnEntar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntarActionPerformed(evt);
            }
        });
        btnEntar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntarKeyPressed(evt);
            }
        });
        jPanel1.add(btnEntar);
        btnEntar.setBounds(460, 490, 350, 59);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(460, 440, 348, 38);

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Senha:");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(460, 410, 73, 25);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(460, 360, 348, 37);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(460, 330, 60, 25);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconPeople_1.png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(530, 130, 210, 200);

        fulndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gradient_1.jpg"))); // NOI18N
        jPanel1.add(fulndo);
        fulndo.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificacao() {
        try {
            String email_user, password_user;
            UserDTO userDto = new UserDTO();

            email_user = txtEmail.getText();
            password_user = txtPassword.getText();

            String senhaHash = Util.geraHash(password_user);
            userDto.setEmail_user(email_user);
            userDto.setPassword_user(senhaHash);

            UserDAO userDao = new UserDAO();
            ResultSet rsUserDao = userDao.authUser(userDto);

            if (rsUserDao.next()) {
                //chamar tela
                frmPrincipalVIEW frmPrincipalView = new frmPrincipalVIEW();
                frmPrincipalView.setLocationRelativeTo(null);
                frmPrincipalView.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Email ou senha inválido");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "frmLoginVIEW: " + e.getMessage());

        }
    }
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnEntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntarActionPerformed
        verificacao();
    }//GEN-LAST:event_btnEntarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnEntarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            verificacao();
        }
    }//GEN-LAST:event_btnEntarKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            verificacao();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmLoginVIEW().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel fulndo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
