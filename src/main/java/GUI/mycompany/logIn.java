/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.mycompany;

import Singleton.SingletonConnection;
import advertisement.concretes.Advertisement;
import user.concretes.Customer;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import user.abstracts.IPerson;
import user.concretes.HouseOwner;
import user.concretes.Person;
import user.concretes.Personnel;

/**
 *
 * @author EmreOzkaya
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Connection db;

    public LogIn() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        turnHome = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        logIn = new javax.swing.JButton();
        forgotPassword = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Air Bnb");
        setLocationByPlatform(true);
        setName("Air Bnb"); // NOI18N
        setResizable(false);

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
        jLabel7.setText("Welcome To AirBnb");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 500, 140));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        turnHome.setBackground(new java.awt.Color(51, 51, 51));
        turnHome.setForeground(new java.awt.Color(255, 255, 255));
        turnHome.setBorder(null);
        turnHome.setBorderPainted(false);
        turnHome.setContentAreaFilled(false);
        turnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turnHome.setDefaultCapable(false);
        turnHome.setFocusPainted(false);
        turnHome.setVerifyInputWhenFocusTarget(false);
        turnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnHomeActionPerformed(evt);
            }
        });
        jPanel3.add(turnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 60, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 800));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Welcome To AirBnb");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 240, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        email.setBackground(new java.awt.Color(51, 51, 51));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setToolTipText("");
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        logIn.setBackground(new java.awt.Color(51, 51, 51));
        logIn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logIn.setForeground(new java.awt.Color(255, 255, 255));
        logIn.setText("Log In");
        logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logIn.setDefaultCapable(false);
        logIn.setRequestFocusEnabled(false);
        logIn.setVerifyInputWhenFocusTarget(false);
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInMouseClicked(evt);
            }
        });
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });

        forgotPassword.setBackground(new java.awt.Color(51, 51, 51));
        forgotPassword.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        forgotPassword.setText("Forgot Password ? ");
        forgotPassword.setBorder(null);
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword.setMaximumSize(new java.awt.Dimension(150, 22));
        forgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(51, 51, 51));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(logIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(89, 89, 89))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 480, 480));

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

    private void forgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordActionPerformed
        // TODO add your handling code here:
        this.dispose();
        RegisterUpdate reg = new RegisterUpdate();
        reg.show();
    }//GEN-LAST:event_forgotPasswordActionPerformed
    
    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
        // TODO add your handling code here:
        Customer customer = new Customer().getUserByEmail(email.getText());
        HouseOwner houseOwner = new HouseOwner().getUserByEmail(email.getText());
        Personnel personnel = new Personnel().getUserByEmail(email.getText());
        if (customer.getPerson_id() == 0 && houseOwner.getPerson_id() != 0) {
            control(houseOwner.isActivationResult(), houseOwner);

        } else if (customer.getPerson_id() != 0 && houseOwner.getPerson_id() == 0) {

            control(customer.isActivationResult(), customer);

        } else if (personnel.getPerson_id() != 0) {
            control(personnel);

        } else {
            JOptionPane.showMessageDialog(null, "There is not membership for this email");

        }
    }//GEN-LAST:event_logInActionPerformed

    private void control(boolean result, HouseOwner houseOwner) {
        if (result) {
            if (email.getText() == null || password.getText() == null) {
                JOptionPane.showMessageDialog(null, "There exist missing field");
            } else {
                if (!isEmailFormatValid()) {
                    JOptionPane.showMessageDialog(null, "Email format is not valid");
                } else if (!userIsCurrent()) {
                    JOptionPane.showMessageDialog(null, "Email or password is not valid");
                } else {
                    this.dispose();
                    Home home = new Home(true, houseOwner);
                    home.show();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your account is examining , Thanks for your patience ");

        }
    }

    private void control(Personnel personnel) {

        if (email.getText() == null || password.getText() == null) {
            JOptionPane.showMessageDialog(null, "There exist missing field");
        } else {
            if (!isEmailFormatValid()) {
                JOptionPane.showMessageDialog(null, "Email format is not valid");
            } else if (!userIsCurrent()) {
                JOptionPane.showMessageDialog(null, "Email or password is not valid");
            } else {
                this.dispose();
                PersonnelScreen pScreen = new PersonnelScreen(true,personnel);
                pScreen.show();
            }
        }

    }

    private void control(boolean result, Customer customer) {
        if (result) {
            if (email.getText() == null || password.getText() == null) {
                JOptionPane.showMessageDialog(null, "There exist missing field");
            } else {
                if (!isEmailFormatValid()) {
                    JOptionPane.showMessageDialog(null, "Email format is not valid");
                } else if (!userIsCurrent()) {
                    JOptionPane.showMessageDialog(null, "Email or password is not valid");
                } else {
                    this.dispose();
                    Home home = new Home(true, customer);
                    home.show();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your account is examining , Thanks for your patience ");

        }
    }
    private void logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_logInMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void turnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home home = new Home();
        home.show();
    }//GEN-LAST:event_turnHomeActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JButton forgotPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logIn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton turnHome;
    // End of variables declaration//GEN-END:variables

    private boolean isEmailFormatValid() {
        String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(EMAIL_PATTERN,
                java.util.regex.Pattern.CASE_INSENSITIVE);
        return pattern.matcher(email.getText()).find();
    }

    private boolean userIsCurrent() {
        String pass = new String(password.getPassword());
        String isUserValid = " SELECT email,password FROM persons WHERE email='" + email.getText() + "' and password='" + pass + "'";

        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(isUserValid);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    

}
