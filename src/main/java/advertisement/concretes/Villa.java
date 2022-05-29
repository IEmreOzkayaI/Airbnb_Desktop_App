/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advertisement.concretes;

import advertisement.abstracts.House;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EmreOzkaya
 */
public class Villa extends House {

    Connection db = Singleton.SingletonConnection.getCon();
    PreparedStatement pst;
    ResultSet rs;

    @Override
    public void create(File[] imageFiles, String[] imagePaths) {
        try {
            pst = db.prepareStatement(Singleton.SingletonConnection.insertionHouse, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, 0);
            pst.setInt(2, getHouseOwnerId());
            pst.setString(3, getRoomNumber());
            pst.setBoolean(4, isHasVehiclePark());
            pst.setString(5, getHeating());
            pst.setString(6, getLocation());
            pst.setString(7, getShortDescription());
            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {

                this.setId(rs.getInt(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Apartment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(File[] imageFiles, String[] imagePaths) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(File[] imageFiles, String[] imagePaths) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void rent(File[] imageFiles, String[] imagePaths) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
