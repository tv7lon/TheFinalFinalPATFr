/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgRestelBook.UI;

import pkgRestelBook.BACKEND.UsersManager;

/**
 *
 * @author dhiys
 */
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
        initComponents();
        editUsersPanel.setVisible(false);
        
        //populate usernames combo box (del + add screen)
        String[] addComboUsernames = UsersManager.getUsernames();
        for (int i = 0; i < UsersManager.getNumUsers(); i++) {
            currentUsersCombo.addItem(addComboUsernames[i]);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editUsersPanel = new javax.swing.JPanel();
        addUserButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        addPassTxtField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        deleteUserButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        addUserTxtField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        currentUsersCombo = new javax.swing.JComboBox<>();
        backToLoginButton = new javax.swing.JButton();
        sameUsernameLabel = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameInTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        incorrectloginLabel = new javax.swing.JLabel();
        passwInPassField = new javax.swing.JPasswordField();
        viewPassCheckBox = new javax.swing.JCheckBox();
        signUpButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editUsersPanel.setBackground(new java.awt.Color(70, 70, 70));

        addUserButton.setBackground(new java.awt.Color(77, 133, 49));
        addUserButton.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        addUserButton.setForeground(new java.awt.Color(255, 255, 255));
        addUserButton.setText("Add");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(168, 175, 57));
        jLabel12.setText("Password:");

        addPassTxtField.setBackground(new java.awt.Color(85, 85, 85));
        addPassTxtField.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        addPassTxtField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(168, 175, 57));
        jLabel13.setText("Current users:");

        deleteUserButton.setBackground(new java.awt.Color(194, 77, 77));
        deleteUserButton.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        deleteUserButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserButton.setText("Delete");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(125, 158, 166));
        jLabel14.setText("Edit users");

        jLabel15.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(168, 175, 57));
        jLabel15.setText("Username:");

        addUserTxtField.setBackground(new java.awt.Color(85, 85, 85));
        addUserTxtField.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        addUserTxtField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/id-card.png"))); // NOI18N

        currentUsersCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentUsersComboActionPerformed(evt);
            }
        });

        backToLoginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backToLoginButton.setText("←");
        backToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginButtonActionPerformed(evt);
            }
        });

        sameUsernameLabel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout editUsersPanelLayout = new javax.swing.GroupLayout(editUsersPanel);
        editUsersPanel.setLayout(editUsersPanelLayout);
        editUsersPanelLayout.setHorizontalGroup(
            editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUsersPanelLayout.createSequentialGroup()
                .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editUsersPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(backToLoginButton)
                        .addGap(186, 186, 186)
                        .addComponent(jLabel14))
                    .addGroup(editUsersPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editUsersPanelLayout.createSequentialGroup()
                                .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addPassTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(addUserTxtField, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(sameUsernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editUsersPanelLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editUsersPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteUserButton)
                                        .addGap(7, 7, 7))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(editUsersPanelLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(currentUsersCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(editUsersPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel25)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        editUsersPanelLayout.setVerticalGroup(
            editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUsersPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(backToLoginButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(24, 24, 24)
                .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editUsersPanelLayout.createSequentialGroup()
                        .addGroup(editUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(editUsersPanelLayout.createSequentialGroup()
                                .addComponent(addUserTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(addPassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editUsersPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addUserButton))
                    .addGroup(editUsersPanelLayout.createSequentialGroup()
                        .addComponent(currentUsersCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(deleteUserButton)))
                .addGap(18, 18, 18)
                .addComponent(sameUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        loginPanel.setBackground(new java.awt.Color(70, 70, 70));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(174, 155, 214));
        jLabel3.setText("Login for Restel Planners");

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        loginButton.setBackground(new java.awt.Color(77, 133, 49));
        loginButton.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        incorrectloginLabel.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        incorrectloginLabel.setForeground(new java.awt.Color(255, 51, 51));
        incorrectloginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        viewPassCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        viewPassCheckBox.setText("View Password");
        viewPassCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPassCheckBoxActionPerformed(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(77, 99, 66));
        signUpButton.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("*If new user then sign up");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(signUpButton)
                .addGap(53, 53, 53)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(incorrectloginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameInTxtField)
                                    .addComponent(passwInPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(viewPassCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(240, 240, 240))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(usernameInTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwInPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewPassCheckBox))))
                .addGap(47, 47, 47)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpButton)
                    .addComponent(loginButton))
                .addGap(18, 18, 18)
                .addComponent(incorrectloginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(editUsersPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(editUsersPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String usernameInStr = usernameInTxtField.getText();
        String usernamePassStr = passwInPassField.getText();

        boolean showNextScreen = UsersManager.loginCheck(usernameInStr, usernamePassStr);

        if (showNextScreen) {
            this.dispose();
            NavigationScreen navigation = new NavigationScreen();
            navigation.setVisible(true);
        } else {
            incorrectloginLabel.setText("*Wrong username or password entered.");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void viewPassCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPassCheckBoxActionPerformed
        // TODO add your handling code here:
        //hide/ view password
        if (!viewPassCheckBox.isSelected()) {
            passwInPassField.setEchoChar('*');
        } else {
            passwInPassField.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_viewPassCheckBoxActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        editUsersPanel.setVisible(true);
        loginPanel.setVisible(false);


    }//GEN-LAST:event_signUpButtonActionPerformed

    private void currentUsersComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentUsersComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentUsersComboActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        // TODO add your handling code here:
        String usernameToDelete = (String) currentUsersCombo.getSelectedItem();
        UsersManager.deleteUser(usernameToDelete);
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        // TODO add your handling code here:
        String usernameToAdd = addUserTxtField.getText();
        String passwordToAdd = addPassTxtField.getText();
        if (UsersManager.checkUsernameDoubles(usernameToAdd)) {
            sameUsernameLabel.setText("This username is taken, please choose another.");
        } else {
            sameUsernameLabel.setText("");
            UsersManager.addUser(usernameToAdd, passwordToAdd);
            currentUsersCombo.addItem(usernameToAdd);
        }


    }//GEN-LAST:event_addUserButtonActionPerformed

    private void backToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginButtonActionPerformed
        // TODO add your handling code here:
        editUsersPanel.setVisible(false);
        loginPanel.setVisible(true);
    }//GEN-LAST:event_backToLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addPassTxtField;
    private javax.swing.JButton addUserButton;
    private javax.swing.JTextField addUserTxtField;
    private javax.swing.JButton backToLoginButton;
    private javax.swing.JComboBox<String> currentUsersCombo;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JPanel editUsersPanel;
    private javax.swing.JLabel incorrectloginLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwInPassField;
    private javax.swing.JLabel sameUsernameLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField usernameInTxtField;
    private javax.swing.JCheckBox viewPassCheckBox;
    // End of variables declaration//GEN-END:variables
}
