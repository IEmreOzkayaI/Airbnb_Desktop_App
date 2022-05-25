/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.concretes;

import advertisement.abstracts.House;
import advertisement.concretes.Comment;
import core.concretes.Block;
import core.concretes.Wallet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import user.abstracts.ICustomer;

/**
 *
 * @author EmreOzkaya
 */
public class Customer extends Person implements ICustomer {

    private Wallet wallet;
    private House rentedHouse;
    private List<Comment> comments;
    private Personnel activationPersonnel;
    private boolean activationResult;
    private boolean isBlocked;
    Connection conn = Singleton.SingletonConnection.getCon();

    public Customer() {
        super();
        wallet = new Wallet(this.getId());
        rentedHouse = null;
        comments = null;
        activationPersonnel = null;
        activationResult = false;
        isBlocked = false;
    }

    @Override
    public boolean register(Person person) {
        boolean flag = false;
        String personInfo = "INSERT INTO persons VALUES (?,?,?,?,?,?,?,?,?)";
        String customerInfo = "INSERT INTO customers VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(personInfo);
            pstmt.setInt(1, person.getId());
            pstmt.setString(2, person.getName());
            pstmt.setString(3, person.getSurname());
            pstmt.setString(4, person.getEmail());
            pstmt.setString(5, person.getPassword());
            pstmt.setString(6, person.getGender());
            pstmt.setString(7, person.getPhoneNumber());
            pstmt.setString(8, person.getIdentityNumber());
            pstmt.setString(9, person.getBirthDate());
            pstmt.execute();
            pstmt = conn.prepareStatement(customerInfo);
            pstmt.setInt(1, person.getId());
            pstmt.setInt(2, this.wallet.getId());
            if (this.rentedHouse == null) {
                pstmt.setNull(3, 0);
            } else {
                pstmt.setInt(3, this.rentedHouse.getId());
            }
            if (this.activationPersonnel == null) {
                pstmt.setNull(4, 0);
            } else {
                pstmt.setInt(4, this.activationPersonnel.getId());
            }

            pstmt.setBoolean(5, this.activationResult);
            pstmt.setBoolean(6, this.isBlocked);
            pstmt.execute();

            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }



    @Override
    public List<Person> getAllIsBlockTrue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
