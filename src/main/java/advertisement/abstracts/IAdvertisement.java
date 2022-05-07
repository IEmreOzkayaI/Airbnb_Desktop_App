/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package advertisement.abstracts;

import advertisement.concretes.Advertisement;
import java.util.List;
import users.concretes.Person;

/**
 *
 * @author EmreOzkaya
 */
public interface IAdvertisement {

    void create(Advertisement advertisement, int ownerId);

    void update(Advertisement advertisement, int ownerId);

    void delete(int advertisementId);

    void validateAdvertisement(Advertisement advertisement);

    int totalPrice(int day, int customerNumber);

    List<Advertisement> getAllAdvertisements();

    List<Advertisement> getAllAdvertisementsIsActiveFalse();

    List<Advertisement> getAllAdvertisementsIsActiveTrue();

    Advertisement showDetailedInfo(int advertisementId);

    void filterHouses(String filterInfo);
}
