package spkkaryawan;

import connection.Koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

public class form_login
        extends javax.swing.JFrame {
    
//    private Connection conn =  new Koneksi().getKoneksi();
    
    Connection conn = Koneksi.getDatabase();
    ResultSet rs = null;
    PreparedStatement ps = null;

    int xx, xy;  
    /**
     * Creates new form form_login
     */
    public form_login() {
//        this.conn = new Koneksi().getKoneksi();
        initComponents();
    }
void bersih(){
    t_username.setText("Username");
    t_password.setText("Password");
    
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_iconadmin = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        t_password = new javax.swing.JTextField();
        t_login = new javax.swing.JButton();
        t_register = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_delete_20px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        t_iconadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon admin.png"))); // NOI18N

        t_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_username.setText("username");
        t_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });

        t_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_password.setText("password");
        t_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        t_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordFocusLost(evt);
            }
        });
        t_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_passwordActionPerformed(evt);
            }
        });

        t_login.setText("Login");
        t_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_loginMouseClicked(evt);
            }
        });

        t_register.setText("Register");

        pass.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(t_iconadmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_login, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_register, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_iconadmin)
                .addGap(18, 18, 18)
                .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass)
                    .addComponent(t_password, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_login, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        String username=t_username.getText();
       if(username.equals("") ||username.equals("username")) {
           t_username.setText("username");
       }
    }//GEN-LAST:event_t_usernameFocusLost

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
      String username=t_username.getText();
       if(username.equals("username")) {
           t_username.setText("");
       }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusGained
       String pass=t_password.getText();
       if(pass.equals("password")) {
           t_password.setText("");
       }
    }//GEN-LAST:event_t_passwordFocusGained

    private void t_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusLost
         String pass=t_password.getText();
       if(pass.equals("") ||t_password.equals("password")) {
           t_password.setText("password");
       }
    }//GEN-LAST:event_t_passwordFocusLost

    private void t_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_passwordActionPerformed

    private void t_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_loginMouseClicked
            
        String sql = "SELECT * FROM login WHERE username=? AND password=?";    
        try {
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, t_username.getText()); 
            ps.setString(2, String.valueOf(pass.getPassword()));
            rs = ps.executeQuery();
            
            if(rs.next()){
                        homePage HE=new homePage();
                        HE.setLocationRelativeTo(null);
                        HE.setVisible(true);
                        dispose();
            }else
                JOptionPane.showMessageDialog(null, "Login Gagal");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_t_loginMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                    getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel t_iconadmin;
    private javax.swing.JButton t_login;
    private javax.swing.JTextField t_password;
    private javax.swing.JButton t_register;
    private javax.swing.JTextField t_username;
    // End of variables declaration//GEN-END:variables
}
