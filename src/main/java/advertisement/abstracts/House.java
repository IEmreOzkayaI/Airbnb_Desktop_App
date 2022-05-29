/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package advertisement.abstracts;

import advertisement.concretes.Advertisement;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import user.concretes.HouseOwner;

/**
 *
 * @author EmreOzkaya
 */
public abstract class House {

    private int id;
    private int advertisementId;
    private int houseOwnerId;
    private String roomNumber;
    private boolean hasVehiclePark;
    private String heating;
    private String location;
    private String shortDescription;
    private String houseImage;
    Connection db = Singleton.SingletonConnection.getCon();
    PreparedStatement pst;

    public House() {
    }

    public abstract void create( File[] imageFiles, String[] imagePaths);

    public abstract void update(File[] imageFiles, String[] imagePaths);

    public abstract void delete(File[] imageFiles, String[] imagePaths);

    public abstract void rent( File[] imageFiles, String[] imagePaths);
    

    public int getAdvertisementId() {
        return advertisementId;
    }

    public String getHeating() {
        return heating;
    }

    public String getHouseImage() {
        return houseImage;
    }

    public int getHouseOwnerId() {
        return houseOwnerId;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public boolean isHasVehiclePark() {
        return hasVehiclePark;
    }

    public void setAdvertisementId(int advertisementId) {
        this.advertisementId = advertisementId;
    }

    public void setHasVehiclePark(boolean hasVehiclePark) {
        this.hasVehiclePark = hasVehiclePark;
    }

    public void setHeating(String heating) {
        this.heating = heating;
    }

    public void setHouseImage(String houseImage) {
        this.houseImage = houseImage;
    }

    public void setHouseOwnerId(int houseOwnerId) {
        this.houseOwnerId = houseOwnerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

}
