/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advertisement.concretes;

import Singleton.SingletonConnection;
import advertisement.abstracts.IAdvertisement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EmreOzkaya
 */
public class Advertisement implements IAdvertisement {

    private int id;
    private int houseOwnerId;
    private int houseId;
    private int price;
    private String advertisementName;
    private String advertisementType;
    private List<Comment> comments;
    private Date calendar;
    private int activationPersonnelId;
    private boolean activationResult;

    Connection db = Singleton.SingletonConnection.getCon();
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    @Override
    public void create() {
        try {
            pst = db.prepareStatement(Singleton.SingletonConnection.insertionAdvertisement);
            pst.setInt(1, 0);
            pst.setInt(2, getHouseOwnerId());
            pst.setInt(3, getHouseId());
            pst.setString(4, getAdvertisementName());
            pst.setString(5, getAdvertisementType());
            pst.setInt(6, 0);
            pst.setBoolean(7, false);
            pst.setDate(8, getCalendar());
            pst.setInt(9, getPrice());
            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Advertisement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Advertisement advertisement, int ownerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int advertisementId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void validateAdvertisement(Advertisement advertisement) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int totalPrice(int day, int customerNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Advertisement> getAllAdvertisements() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Advertisement> getAllAdvertisementsIsActiveFalse() {
        List<Advertisement> list = new ArrayList<Advertisement>();
        try {
            st = db.createStatement();
            rs = st.executeQuery(SingletonConnection.getAllAdvertisementsIsActiveFalse);
            while (rs.next()) {
                Advertisement ad = new Advertisement();
                ad.setId(rs.getInt("id"));
                ad.setHouseOwnerId(rs.getInt("person_id"));
                ad.setHouseId(rs.getInt("house_id"));
                ad.setAdvertisementName(rs.getString("advertisement_name"));
                ad.setAdvertisementType(rs.getString("advertisement_type"));
                ad.setActivationPersonnelId(rs.getInt("activation_personnel_id"));
                ad.setActivationResult(rs.getBoolean("activation_result"));
                ad.setCalendar(rs.getDate("calendar"));
                ad.setPrice(rs.getInt("price"));
                list.add(ad);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Advertisement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void getAdvertisementImages() {
        
    }

    @Override
    public List<Advertisement> getAllAdvertisementsIsActiveTrue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Advertisement showDetailedInfo(int advertisementId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void filterHouses(String filterInfo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getActivationPersonnelId() {
        return activationPersonnelId;
    }

    public String getAdvertisementName() {
        return advertisementName;
    }

    public String getAdvertisementType() {
        return advertisementType;
    }

    public Date getCalendar() {
        return calendar;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public int getHouseId() {
        return houseId;
    }

    public int getHouseOwnerId() {
        return houseOwnerId;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public boolean isActivationResult() {
        return activationResult;
    }

    public void setActivationPersonnelId(int activationPersonnelId) {
        this.activationPersonnelId = activationPersonnelId;
    }

    public void setActivationResult(boolean activationResult) {
        this.activationResult = activationResult;
    }

    public void setAdvertisementName(String advertisementName) {
        this.advertisementName = advertisementName;
    }

    public void setAdvertisementType(String advertisementType) {
        this.advertisementType = advertisementType;
    }

    public void setCalendar(Date calendar) {
        this.calendar = calendar;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public void setHouseOwnerId(int houseOwnerId) {
        this.houseOwnerId = houseOwnerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
