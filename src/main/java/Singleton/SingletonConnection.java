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
    public static String getHouseIconImg="SELECT * FROM house_images WHERE house_id=";
    public static String getAdvertisementById="SELECT * FROM advertisements WHERE id=";
    public static String getCommentsById="SELECT * FROM comments WHERE advertisement_id=";
    public static String getPersonById="SELECT * FROM persons WHERE id=";
    public static String insertComment="INSERT INTO comments VALUES(?,?,?,?,?)";

    private SingletonConnection() {
        getCon();
    }

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localHost:3306/airbnb", "root", "12345");

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

}
