/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package advertisement.abstracts;

import advertisement.concretes.Advertisement;
import java.util.List;
import user.concretes.Personnel;

/**
 *
 * @author EmreOzkaya
 */
public interface IAdvertisement {

    void create();

    void update(Advertisement advertisement, int ownerId);

    void delete();

    void validateAdvertisement(Personnel personnel, int advertisementId);

    int totalPrice(int day, int customerNumber);

    List<Advertisement> getAllAdvertisementsIsActiveFalse();

    List<Advertisement> getAllAdvertisementsIsActiveTrue();

    Advertisement showDetailedInfo(int advertisementId);

    void filterHouses(String filterInfo);
}
