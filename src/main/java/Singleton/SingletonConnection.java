/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author EmreOzkaya
 */
public class SingletonConnection {

    private static Connection conn;
    public static String insertionPerson = "INSERT INTO persons VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    public static String insertionCustomer = "INSERT INTO customers VALUES(?,?,?,?)";
    public static String insertionHouseOwner = "INSERT INTO house_owners VALUES(?,?,?,?)";
    public static String deleteFromCustomer = "DELETE FROM customers WHERE person_id=";
    public static String getCustomerInfoById = "SELECT * FROM customers WHERE person_id=";
    public static String insertionHouse = "INSERT INTO houses VALUES(?,?,?,?,?,?,?)";
    public static String insertionAdvertisement = "INSERT INTO advertisements VALUES(?,?,?,?,?,?,?,?,?)";
    public static String getAdvertisementByPersonId = "SELECT * FROM advertisements WHERE person_id=";
    public static String getHouseByPersonId = "SELECT * FROM houses WHERE person_id=";
    public static String getImageByHouseId = "SELECT * FROM house_images WHERE house_id=";
    public static String insertionHouseImages = "INSERT INTO house_images VALUES(?,?,?,?)";
    public static String getAllAdvertisementsIsActiveFalse = "SELECT * FROM advertisements WHERE activation_result=false";
    public static String getAllAdvertisementsIsActiveTrue = "SELECT * FROM advertisements WHERE activation_result=true";
    public static String getAllPersonIsActiveFalse = "SELECT * FROM persons WHERE activation_result=false";
    public static String getHouseById = "SELECT * FROM houses WHERE id=";
    public static String getHouseIconImg = "SELECT * FROM house_images WHERE house_id=";
    public static String getAdvertisementById = "SELECT * FROM advertisements WHERE id=";
    public static String getCommentsById = "SELECT * FROM comments WHERE advertisement_id=";
    public static String getPersonById = "SELECT * FROM persons WHERE id=";
    public static String getPersonnelById = "SELECT * FROM personnels WHERE person_id=";
    public static String getCommentsByPersonId = "SELECT * FROM comments WHERE person_id=";

    public static String insertComment = "INSERT INTO comments VALUES(?,?,?,?,?)";
    public static String getWalletById = "SELECT * FROM wallets WHERE id=";
    public static String getAllCustomerIsBlockTrue = "SELECT * FROM customers WHERE is_blocked=true";
    public static String getAllHouseOwnerIsBlockTrue = "SELECT * FROM house_owners WHERE is_blocked=true";

    public static String updateCustomerBlockedInfoById = "UPDATE customers SET is_blocked=(?) WHERE person_id =";
    public static String updateHouseOwnerBlockedInfoById = "UPDATE house_owners SET is_blocked=(?) WHERE person_id =";
    public static String removeBlockedPersonById = "DELETE FROM blocked_persons WHERE person_id=";
    public static String getBlockedPersonByID = "SELECT * FROM blocked_persons WHERE person_id=";
    public static String insertionWallet = "INSERT INTO wallets VALUES(?,?)";
    public static String updateWalletById = "UPDATE wallets SET total_amount=(?) WHERE id =";
    public static String deleteCommentById = "DELETE FROM comments WHERE id=";
    public static String deleteCommentByBlockedPersonId = "DELETE FROM comments WHERE person_id=";
    public static String insertBlockedPerson = "INSERT INTO blocked_persons VALUES(?,?,?,?)";

    private SingletonConnection() {
        getCon();
    }

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localHost:3306/air_bnb", "root", "kaSaba.2001");

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

}
