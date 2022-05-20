import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(100, 101, 165));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 241, 243));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 120, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 3, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, 30));

        txtUsername.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(4, 3, 12));
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 241, 243), 1, true));
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 240, 30));

        pwdPassword.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        pwdPassword.setForeground(new java.awt.Color(4, 3, 12));
        pwdPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 241, 243), 1, true));
        jPanel3.add(pwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 240, 30));

        btnLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setFocusPainted(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 80, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 3, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 80, 30));

        btnReset.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnReset.setBorder(null);
        btnReset.setFocusPainted(false);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.setLabel("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel3.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 80, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //------------------------------ VERIFY USER ------------------------------
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText();
        String password = new String(pwdPassword.getPassword());
        if (username.equals("root") && password.equals("sesame"))
        {
            new AddressBook().setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "username or password invalid!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    
    //------------------------------ CLEARS DATA ------------------------------
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUsername.setText(null);
        pwdPassword.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
