/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package user.abstracts;

import user.concretes.Person;
import java.util.List;

/**
 *
 * @author EmreOzkaya
 */
public interface IPerson {

    boolean logIn(String email,String password);

    Person getUserByEmail(String email);
    boolean update();

    public boolean isEmailExist(String email);

    public boolean isIdentityExist(String identity);

    public boolean updatePassword(String email, String password) ;
    }
