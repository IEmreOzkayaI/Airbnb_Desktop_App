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
import user.concretes.Person;
import user.abstracts.ICustomer;

/**
 *
 * @author EmreOzkaya
 */
public class HouseOwner extends Person implements ICustomer {

    private int person_id;
    private Wallet wallet;
    private House rentedHouse;
    private List<House> housesToRent;
    private List<Comment> comments;

    private boolean isBlocked;
    Connection db = Singleton.SingletonConnection.getCon();

    public HouseOwner() {
        super();
        wallet = new Wallet(this.getId());
        rentedHouse = null;
        comments = null;

        isBlocked = false;
        housesToRent = null;
    }

    @Override
    public boolean register(Person person) {
        boolean flag = false;

        try {

            PreparedStatement prepstmtPerson = db.prepareStatement(Singleton.SingletonConnection.insertionPerson);
            PreparedStatement prepstmtCustomer = db.prepareStatement(Singleton.SingletonConnection.insertionHouseOwner);

            // this id is null value because our database id increasing auto.
            // because of a error we couldn't do fk relation on the database table.So we use different values.
            prepstmtPerson.setInt(1, person.getId());
            prepstmtPerson.setString(2, person.getName());
            prepstmtPerson.setString(3, person.getSurname());
            prepstmtPerson.setString(4, person.getEmail());
            prepstmtPerson.setString(5, person.getPassword());
            prepstmtPerson.setString(6, person.getGender());
            prepstmtPerson.setString(7, person.getPhoneNumber());
            prepstmtPerson.setString(8, person.getIdentityNumber());
            prepstmtPerson.setString(9, person.getBirthDate());
            prepstmtPerson.setInt(10, person.getActivationPersonnelId());
            prepstmtPerson.setBoolean(11, person.isActivationResult());

            prepstmtPerson.execute();
            Person temp_Person = new Person();
            int customer_id = temp_Person.getUserByEmail(person.getEmail()).getId();
            prepstmtCustomer.setInt(1, customer_id);
            prepstmtCustomer.setInt(2, 0);
            prepstmtCustomer.setInt(3, 0);

            prepstmtCustomer.setBoolean(4, false);

            prepstmtCustomer.execute();

            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean registerFromCustomer(HouseOwner houseOwner) {
        boolean flag = false;

        try {

            PreparedStatement prepstmtCustomer = db.prepareStatement(Singleton.SingletonConnection.insertionHouseOwner);
            PreparedStatement removeCustomer = db.prepareStatement(Singleton.SingletonConnection.deleteFromCustomer + "'" + houseOwner.getId() + "'");

            prepstmtCustomer.setInt(1, houseOwner.getId());
            prepstmtCustomer.setInt(2, houseOwner.getWallet().getId());
            if (houseOwner.getRentedHouse() != null) {
                prepstmtCustomer.setInt(3, houseOwner.getRentedHouse().getId());
            } else {
                prepstmtCustomer.setInt(3, 0);
            }
            prepstmtCustomer.setBoolean(4, false);

            prepstmtCustomer.execute();
            removeCustomer.execute();

            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    @Override
    public HouseOwner getUserByEmail(String email) {
        HouseOwner houseOwner = new HouseOwner();
        String getPersonInfoByEmail = " SELECT * FROM persons WHERE email='" + email + "'";
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(getPersonInfoByEmail);
            if (rs.next()) {
                houseOwner.setBirthDate(rs.getString("birth_date"));
                houseOwner.setEmail(rs.getString("email"));
                houseOwner.setGender(rs.getString("gender"));
                houseOwner.setId(rs.getInt("id"));
                houseOwner.setIdentityNumber(rs.getString("identity_number"));
                houseOwner.setName(rs.getString("name"));
                houseOwner.setPassword(rs.getString("password"));
                houseOwner.setPhoneNumber(rs.getString("phone_number"));
                houseOwner.setSurname(rs.getString("surname"));
                houseOwner.setActivationPersonnelId(rs.getInt("activation_personnel_id"));
                houseOwner.setActivationResult(rs.getBoolean("activation_result"));
            }
            String getCustomerInfoByEmail = "SELECT * FROM house_owners WHERE person_id='" + houseOwner.getId() + "'";

            ResultSet rs2 = stmt.executeQuery(getCustomerInfoByEmail);
            if (rs2.next()) {
                houseOwner.setIsBlocked(rs2.getBoolean("is_blocked"));
                houseOwner.setPerson_id(rs2.getInt("person_id"));
//                customer.setRentedHouse(rs2.getString("rented_house_id"));
                //        customer.setWallet(rs2.getInt("wallet_id"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return houseOwner;
    }

    @Override
    public List<Person> getAllIsBlockTrue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<House> getHousesToRent() {
        return housesToRent;
    }

    public House getRentedHouse() {
        return rentedHouse;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setHousesToRent(List<House> housesToRent) {
        this.housesToRent = housesToRent;
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

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
}
