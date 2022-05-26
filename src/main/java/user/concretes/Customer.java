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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    private Connection db = Singleton.SingletonConnection.getCon();
    private String insertionPerson = "INSERT INTO persons VALUES(?,?,?,?,?,?,?,?,?)";
    private String insertionCustomer = "INSERT INTO customers VALUES(?,?,?,?,?,?)";

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

        try {

            PreparedStatement prepstmtPerson = getDb().prepareStatement(getInsertionPerson());
            PreparedStatement prepstmtCustomer = getDb().prepareStatement(getInsertionCustomer());
            // this id is null value because our database id increasing auto.
            // because of a error we couldn't do fk relation on the database table.So we use different values.
            int id = 0;
            prepstmtPerson.setInt(1, person.getId());
            prepstmtPerson.setString(2, person.getName());
            prepstmtPerson.setString(3, person.getSurname());
            prepstmtPerson.setString(4, person.getEmail());
            prepstmtPerson.setString(5, person.getPassword());
            prepstmtPerson.setString(6, person.getGender());
            prepstmtPerson.setString(7, person.getPhoneNumber());
            prepstmtPerson.setString(8, person.getIdentityNumber());
            prepstmtPerson.setString(9, person.getBirthDate());

            prepstmtPerson.execute();

            prepstmtCustomer.setInt(1, id);
            prepstmtCustomer.setString(2, null);
            prepstmtCustomer.setString(3, null);
            prepstmtCustomer.setString(4, null);
            prepstmtCustomer.setBoolean(5, false);
            prepstmtCustomer.setBoolean(6, false);

            prepstmtCustomer.execute();

            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }

    public boolean emailExist(String email) {
        String isUserRegistered = " SELECT email FROM persons WHERE email='" + email + "'";

        try {
            Statement stmt = getDb().createStatement();
            ResultSet rs = stmt.executeQuery(isUserRegistered);
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean identityExist(String identity) {
        String isUserRegistered = " SELECT email FROM persons WHERE identity_number='" + identity + "'";

        try {
            Statement stmt = getDb().createStatement();
            ResultSet rs = stmt.executeQuery(isUserRegistered);
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updatePassword(String email, String password) {
        String update = " UPDATE persons SET password='" + password + "' WHERE email='" + email + "'";
        Customer customer = getUserByEmail(email);
        if (customer.getEmail().equalsIgnoreCase(email)) {
            return false;
        } else {
            try {
                PreparedStatement updatePass = getDb().prepareStatement(update);
                updatePass.execute();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

    public Customer getUserByEmail(String email) {
        Customer customer = new Customer();
        String getPersonInfoByEmail = " SELECT * FROM persons WHERE email='" + email + "'";
        try {
            Statement stmt = getDb().createStatement();
            ResultSet rs = stmt.executeQuery(getPersonInfoByEmail);
            if (rs.next()) {
                customer.setBirthDate(rs.getString("birth_date"));
                customer.setEmail(rs.getString("email"));
                customer.setGender(rs.getString("gender"));
                customer.setId(rs.getInt("id"));
                customer.setIdentityNumber(rs.getString("identity_number"));
                customer.setName(rs.getString("name"));
                customer.setPassword(rs.getString("password"));
                customer.setPhoneNumber(rs.getString("phone_number"));
                customer.setSurname(rs.getString("surname"));
            }
            String getCustomerInfoByEmail = "SELECT * FROM customers WHERE person_id='" + customer.getId() + "'";

            ResultSet rs2 = stmt.executeQuery(getCustomerInfoByEmail);
            if (rs2.next()) {
                //  customer.setActivationPersonnel(rs2.getInt("activation_personnel_id"));
                customer.setActivationResult(rs2.getBoolean("activation_result"));
                customer.setIsBlocked(rs2.getBoolean("is_blocked"));
//                customer.setRentedHouse(rs2.getString("rented_house_id"));
                //        customer.setWallet(rs2.getInt("wallet_id"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    }

    @Override
    public List<Person> getAllIsBlockTrue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Personnel getActivationPersonnel() {
        return activationPersonnel;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Connection getDb() {
        return db;
    }

    public String getInsertionCustomer() {
        return insertionCustomer;
    }

    public String getInsertionPerson() {
        return insertionPerson;
    }

    public House getRentedHouse() {
        return rentedHouse;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public boolean isActivationResult() {
        return activationResult;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setActivationPersonnel(Personnel activationPersonnel) {
        this.activationPersonnel = activationPersonnel;
    }

    public void setActivationResult(boolean activationResult) {
        this.activationResult = activationResult;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setDb(Connection db) {
        this.db = db;
    }

    public void setInsertionCustomer(String insertionCustomer) {
        this.insertionCustomer = insertionCustomer;
    }

    public void setInsertionPerson(String insertionPerson) {
        this.insertionPerson = insertionPerson;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public void setRentedHouse(House rentedHouse) {
        this.rentedHouse = rentedHouse;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

}
