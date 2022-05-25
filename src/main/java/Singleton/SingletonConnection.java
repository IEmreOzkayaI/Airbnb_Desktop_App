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
