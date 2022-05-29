/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import GUI.mycompany.Home;
import GUI.mycompany.SignUp;
import java.sql.Connection;
import user.concretes.Customer;


/**
 *
 * @author EmreOzkaya
 */
public class main {
    public static void main(String[] args) {
     // Home home = new Home(true,new Customer());
      Home home = new Home();
       home.show();
    }
}
