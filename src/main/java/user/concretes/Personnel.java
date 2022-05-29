/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.concretes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EmreOzkaya
 */
public class Personnel extends Person {

    private int person_id;

    public Personnel() {

    }

    public Personnel getUserByEmail(String email) {
        Personnel personnel = new Personnel();
        String getPersonInfoByEmail = " SELECT * FROM persons WHERE email='" + email + "'";
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(getPersonInfoByEmail);
            if (rs.next()) {
                personnel.setBirthDate(rs.getString("birth_date"));
                personnel.setEmail(rs.getString("email"));
                personnel.setGender(rs.getString("gender"));
                personnel.setId(rs.getInt("id"));
                personnel.setIdentityNumber(rs.getString("identity_number"));
                personnel.setName(rs.getString("name"));
                personnel.setPassword(rs.getString("password"));
                personnel.setPhoneNumber(rs.getString("phone_number"));
                personnel.setSurname(rs.getString("surname"));
                personnel.setActivationPersonnelId(rs.getInt("activation_personnel_id"));
                personnel.setActivationResult(rs.getBoolean("activation_result"));
            }
            String getCustomerInfoByEmail = "SELECT * FROM personnels WHERE person_id='" + personnel.getId() + "'";

            ResultSet rs2 = stmt.executeQuery(getCustomerInfoByEmail);
            if (rs2.next()) {
                personnel.setPerson_id(rs2.getInt("person_id"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personnel;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

}
