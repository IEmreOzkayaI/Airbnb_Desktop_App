/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advertisement.concretes;

import advertisement.abstracts.IAdvertisement;
import java.util.Date;
import java.util.List;

/**
 *
 * @author EmreOzkaya
 */
public class Advertisement implements IAdvertisement{
    
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
    

    @Override
    public void create(Advertisement advertisement, int ownerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
