/*
 * @author Tyler Knowles, Tommy Godfrey
 */
package coursework;

public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login(UserData d) {
        initComponents();
        inData = d;
    }
    
    public login() {
        initComponents();
        System.out.println("No link");
    }
    
    public UserData inData;

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldLoginUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldRegisterUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboBoxTastes = new javax.swing.JComboBox<>();
        buttonAddGenre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTastes = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        fieldRegisterPlaceOfBirth = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fieldRegisterDateOfBirth = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        buttonRegister = new javax.swing.JButton();
        fieldLoginPassword = new javax.swing.JPasswordField();
        fieldRegisterPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Login");

        fieldLoginUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldLoginUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldLoginUsernameFocusLost(evt);
            }
        });
        fieldLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLoginUsernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Username");

        fieldRegisterUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldRegisterUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldRegisterUsernameFocusLost(evt);
            }
        });
        fieldRegisterUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRegisterUsernameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Music Profile");

        comboBoxTastes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxTastes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opera", "Rock", "Pop" }));
        comboBoxTastes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTastesActionPerformed(evt);
            }
        });

        buttonAddGenre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAddGenre.setText("Add");
        buttonAddGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddGenreActionPerformed(evt);
            }
        });

        areaTastes.setColumns(20);
        areaTastes.setRows(5);
        jScrollPane1.setViewportView(areaTastes);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Place of Birth");

        fieldRegisterPlaceOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldRegisterPlaceOfBirth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldRegisterPlaceOfBirthFocusLost(evt);
            }
        });
        fieldRegisterPlaceOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRegisterPlaceOfBirthActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Date of Birth");

        fieldRegisterDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldRegisterDateOfBirth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldRegisterDateOfBirthFocusLost(evt);
            }
        });
        fieldRegisterDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRegisterDateOfBirthActionPerformed(evt);
            }
        });

        buttonLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonRegister.setText("Register");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        fieldLoginPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldRegisterPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(fieldLoginUsername)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLoginPassword))
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldRegisterUsername)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldRegisterDateOfBirth)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldRegisterPlaceOfBirth)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldRegisterPassword)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(139, 139, 139))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboBoxTastes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonAddGenre)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldRegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBoxTastes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonAddGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addGap(5, 5, 5)
                                .addComponent(fieldRegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldRegisterPlaceOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldRegisterDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLoginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLoginUsernameActionPerformed

    private void fieldRegisterUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRegisterUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRegisterUsernameActionPerformed

    private void comboBoxTastesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTastesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTastesActionPerformed

    private void buttonAddGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddGenreActionPerformed
        // TODO add your handling code here:
        inData.listOfTastes.add(comboBoxTastes.getSelectedItem().toString());
        areaTastes.append(comboBoxTastes.getSelectedItem().toString() + "\n");
    }//GEN-LAST:event_buttonAddGenreActionPerformed

    private void fieldRegisterPlaceOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRegisterPlaceOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRegisterPlaceOfBirthActionPerformed

    private void fieldRegisterDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRegisterDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRegisterDateOfBirthActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // Login button pressed:
        inData.username = fieldLoginUsername.getText();
        String pass = new String(fieldLoginPassword.getPassword());
        inData.password = pass;
        dispose();
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        // Register button pressed:
        inData.username = fieldRegisterUsername.getText();
        String pass = new String(fieldRegisterPassword.getPassword());
        inData.password = pass;
        inData.placeOfBirth = fieldRegisterPlaceOfBirth.getText();
        inData.dateOfBirth = fieldRegisterDateOfBirth.getText();
        dispose();
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void fieldLoginUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldLoginUsernameFocusLost
        // When focus lost from login username:
        
    }//GEN-LAST:event_fieldLoginUsernameFocusLost

    private void fieldRegisterUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldRegisterUsernameFocusLost
        // When focus lost from register username:
        
    }//GEN-LAST:event_fieldRegisterUsernameFocusLost

    private void fieldRegisterPlaceOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldRegisterPlaceOfBirthFocusLost
        // When focus lost from register POB:
        
    }//GEN-LAST:event_fieldRegisterPlaceOfBirthFocusLost

    private void fieldRegisterDateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldRegisterDateOfBirthFocusLost
        // When focus lost from register DOB:
        
    }//GEN-LAST:event_fieldRegisterDateOfBirthFocusLost

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTastes;
    private javax.swing.JButton buttonAddGenre;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JComboBox<String> comboBoxTastes;
    private javax.swing.JPasswordField fieldLoginPassword;
    private javax.swing.JTextField fieldLoginUsername;
    private javax.swing.JTextField fieldRegisterDateOfBirth;
    private javax.swing.JPasswordField fieldRegisterPassword;
    private javax.swing.JTextField fieldRegisterPlaceOfBirth;
    private javax.swing.JTextField fieldRegisterUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
