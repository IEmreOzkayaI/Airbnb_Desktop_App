/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package advertisement.abstracts;

import user.concretes.HouseOwner;

/**
 *
 * @author EmreOzkaya
 */
public abstract class House {

    private int id;
    private int advertisementId;
    private HouseOwner houseOwnerId;
    private int price;
    private String roomNumber;
    private boolean hasVehiclePark;
    private String heating;
    private String location;
    private String shortDescription;
    private String houseImage;

    public House() {
    }

    public abstract void create(int houseOwnerId, int advertisementId);

    public abstract void update(int houseOwnerId, int advertisementId);

    public abstract void delete(int houseOwnerId, int advertisementId);

    public abstract void rent(int houseOwnerId, int advertisementId);

    public int getAdvertisementId() {
        return advertisementId;
    }

    public String getHeating() {
        return heating;
    }

    public String getHouseImage() {
        return houseImage;
    }

    public HouseOwner getHouseOwnerId() {
        return houseOwnerId;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
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

    public void setHouseOwnerId(HouseOwner houseOwnerId) {
        this.houseOwnerId = houseOwnerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

}
