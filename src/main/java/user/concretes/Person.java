/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.concretes;

import user.abstracts.IPerson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author EmreOzkaya
 */
public class Person implements IPerson {

    private int id;
    private String name;
    private String email;
    private Date birtDate;
    private String gender;
    private String surname;
    private String userName;
    private String password;
    private String phoneNumber;
    private String identityNumber;
    
    public Person(){  }

    public Date getBirtDate() {
        return birtDate;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean logIn(Person person) {

        return true;
    }

    @Override
    public List<Person> getAllIsActiveFalse() {

        return null;
    }
}
