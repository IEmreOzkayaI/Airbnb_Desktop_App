/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.mycompany;

import Singleton.SingletonConnection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import user.concretes.Customer;
import user.concretes.Person;

/**
 *
 * @author EmreOzkaya
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    Connection db;

    String insertionHouseOwner = "INSERT INTO houseowners  VALUES(?,?,?,?,?,?)";

    public SignUp() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        db = SingletonConnection.getCon();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        turnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        email = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        identityNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        birthDate = new javax.swing.JFormattedTextField();
        repeatOfPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 90, 95));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1330, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Airbnb is waiting you");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 500, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\emrec\\OneDrive\\Belgeler\\NetBeansProjects\\OOP\\src\\main\\java\\img\\2993798_social media_airbnb_icon (3).png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        turnHome.setBackground(new java.awt.Color(51, 51, 51));
        turnHome.setForeground(new java.awt.Color(255, 255, 255));
        turnHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\emrec\\OneDrive\\Belgeler\\NetBeansProjects\\OOP\\src\\main\\java\\img\\icons8-left-arrow-32(1).png")); // NOI18N
        turnHome.setBorder(null);
        turnHome.setBorderPainted(false);
        turnHome.setContentAreaFilled(false);
        turnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turnHome.setDefaultCapable(false);
        turnHome.setFocusPainted(false);
        turnHome.setRolloverEnabled(false);
        turnHome.setVerifyInputWhenFocusTarget(false);
        turnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnHomeActionPerformed(evt);
            }
        });
        jPanel3.add(turnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 60, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 800));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        name.setBackground(new java.awt.Color(51, 51, 51));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setToolTipText("");
        name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        male.setBackground(new java.awt.Color(51, 51, 51));
        gender.add(male);
        male.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setBackground(new java.awt.Color(51, 51, 51));
        gender.add(female);
        female.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("FEMALE");

        email.setBackground(new java.awt.Color(51, 51, 51));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setToolTipText("");
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        surname.setBackground(new java.awt.Color(51, 51, 51));
        surname.setForeground(new java.awt.Color(255, 255, 255));
        surname.setToolTipText("");
        surname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SURNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameActionPerformed(evt);
            }
        });

        phoneNumber.setBackground(new java.awt.Color(51, 51, 51));
        phoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumber.setToolTipText("");
        phoneNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PHONE NUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });

        identityNumber.setBackground(new java.awt.Color(51, 51, 51));
        identityNumber.setForeground(new java.awt.Color(255, 255, 255));
        identityNumber.setToolTipText("");
        identityNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IDENTITY NUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        identityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identityNumberActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN UP");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        birthDate.setBackground(new java.awt.Color(51, 51, 51));
        birthDate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BIRTH DATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        birthDate.setForeground(new java.awt.Color(255, 255, 255));
        try {
            birthDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        birthDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        birthDate.setToolTipText("");
        birthDate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        birthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateActionPerformed(evt);
            }
        });

        repeatOfPassword.setBackground(new java.awt.Color(51, 51, 51));
        repeatOfPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        repeatOfPassword.setForeground(new java.awt.Color(255, 255, 255));
        repeatOfPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPEAT OF PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        password.setBackground(new java.awt.Color(51, 51, 51));
        password.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(repeatOfPassword))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(surname, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(name))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(password)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(male)
                                .addGap(18, 18, 18)
                                .addComponent(female))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(identityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(birthDate, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(repeatOfPassword))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(identityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(female)
                    .addComponent(male))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 570, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void identityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identityNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Customer customer = new Customer();
        if (name.getText().isEmpty() || surname.getText().isEmpty() || email.getText().isEmpty() || password.getText().isEmpty() || repeatOfPassword.getText().isEmpty() || phoneNumber.getText().isEmpty() || identityNumber.getText().isEmpty() || birthDate.getText().isEmpty() || gender.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "There exist missing field");
        } else {
            if (!isEmailFormatValid()) {
                JOptionPane.showMessageDialog(null, "Email not valid");
            }

            else if (!password.getText().equals(repeatOfPassword.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords are not same");
            }
            else if (customer.emailExist(email.getText())) {
                JOptionPane.showMessageDialog(null, " Email already exist ! ");
            }
            else if (customer.identityExist(identityNumber.getText())) {
                JOptionPane.showMessageDialog(null, " User already exist ! ");

            } else { // No error so register user.
                String pass = new String(password.getPassword());

                customer.setBirthDate(birthDate.getText());
                customer.setEmail(email.getText());
                if (gender.getSelection().toString().equalsIgnoreCase("Male")) {
                    customer.setGender("male");
                } else {
                    customer.setGender("female");
                }
                customer.setId(0);
                customer.setIdentityNumber(identityNumber.getText());
                customer.setName(name.getText());
                customer.setPassword(pass);
                customer.setPhoneNumber(phoneNumber.getText());
                customer.setSurname(surname.getText());
                if (customer.register(customer)) {
                    JOptionPane.showMessageDialog(null, "Thanks For Join Us , Please Wait Personnel Validation");
                    Home home = new Home();
                    home.show();
                    this.dispose();
                   } else {
                    JOptionPane.showMessageDialog(null, "Error! ");
                }

            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void birthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDateActionPerformed

    private void turnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home home = new Home();
        home.show();
    }//GEN-LAST:event_turnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    private boolean isEmailFormatValid() {
        String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(EMAIL_PATTERN,
                java.util.regex.Pattern.CASE_INSENSITIVE);
        return pattern.matcher(email.getText()).find();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField birthDate;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JTextField identityNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JPasswordField repeatOfPassword;
    private javax.swing.JTextField surname;
    private javax.swing.JButton turnHome;
    // End of variables declaration//GEN-END:variables
}
