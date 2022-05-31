/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.mycompany;

import Singleton.SingletonConnection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;

import javax.swing.JOptionPane;
import user.concretes.Customer;
import user.concretes.HouseOwner;
import user.concretes.Person;

/**
 *
 * @author EmreOzkaya
 */
public class ProfileScreen extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    Connection db;
    Person person;

    public ProfileScreen() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        db = SingletonConnection.getCon();

    }

    public ProfileScreen(HouseOwner houseOwner) {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        db = SingletonConnection.getCon();
        person = houseOwner;
        name.setText(person.getName().toUpperCase());
        surname.setText(person.getSurname().toUpperCase());
        identityNumber.setText(person.getIdentityNumber());
        birthDate.setText(person.getBirthDate());
    }

    public ProfileScreen(Customer customer) {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        db = SingletonConnection.getCon();
        person = customer;
        name.setText(person.getName().toUpperCase());
        surname.setText(person.getSurname().toUpperCase());
        identityNumber.setText(person.getIdentityNumber());
        birthDate.setText(person.getBirthDate());
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
        memberShipType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        turnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        identityNumber = new javax.swing.JTextField();
        updateInfo = new javax.swing.JButton();
        birthDate = new javax.swing.JFormattedTextField();
        repeatOfPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();

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
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        turnHome.setBackground(new java.awt.Color(51, 51, 51));
        turnHome.setForeground(new java.awt.Color(255, 255, 255));
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

        name.setEditable(false);
        name.setBackground(new java.awt.Color(51, 51, 51));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setToolTipText("");
        name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        email.setBackground(new java.awt.Color(51, 51, 51));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setToolTipText("");
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        surname.setEditable(false);
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

        identityNumber.setEditable(false);
        identityNumber.setBackground(new java.awt.Color(51, 51, 51));
        identityNumber.setForeground(new java.awt.Color(255, 255, 255));
        identityNumber.setToolTipText("");
        identityNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IDENTITY NUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        identityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identityNumberActionPerformed(evt);
            }
        });

        updateInfo.setBackground(new java.awt.Color(51, 51, 51));
        updateInfo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        updateInfo.setForeground(new java.awt.Color(255, 255, 255));
        updateInfo.setText("UPDATE");
        updateInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        updateInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoActionPerformed(evt);
            }
        });

        birthDate.setEditable(false);
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
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(repeatOfPassword))
                    .addComponent(updateInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumber)
                            .addComponent(surname)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(identityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(birthDate, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatOfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(identityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(updateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 570, 680));

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

    private void updateInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoActionPerformed
        // TODO add your handling code here:
        Customer customer = new Customer();
        HouseOwner houseowner = new HouseOwner();

        if (email.getText().isEmpty() || password.getText().isEmpty() || repeatOfPassword.getText().isEmpty() || phoneNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all fields without missing field");
        } else {
            if (!isEmailFormatValid()) {
                JOptionPane.showMessageDialog(null, "Email not valid");
            } else if (!password.getText().equals(repeatOfPassword.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords are not same");
            } else if (customer.isEmailExist(email.getText()) || houseowner.isEmailExist(email.getText())) {
                JOptionPane.showMessageDialog(null, " Email already exist ! ");
            } else { // No error so register user.
                String pass = new String(password.getPassword());
                person.setEmail(email.getText());
                person.setId(person.getId());
                person.setPassword(pass);
                person.setPhoneNumber(phoneNumber.getText());
                person.setActivationResult(false);
                person.setActivationPersonnelId(0);
                if (person.update()) {
                    JOptionPane.showMessageDialog(null, "Thanks For Introduce Us , Please Wait Personnel Validation");
                    Home home = new Home();
                    home.show();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error! ");
                }

            }

        }


    }//GEN-LAST:event_updateInfoActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileScreen().setVisible(true);
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
    private javax.swing.ButtonGroup gender;
    private javax.swing.JTextField identityNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.ButtonGroup memberShipType;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JPasswordField repeatOfPassword;
    private javax.swing.JTextField surname;
    private javax.swing.JButton turnHome;
    private javax.swing.JButton updateInfo;
    // End of variables declaration//GEN-END:variables
}