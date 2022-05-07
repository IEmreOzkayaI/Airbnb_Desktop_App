/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.concretes;

import core.abstracts.IWallet;
import user.concretes.Person;

/**
 *
 * @author EmreOzkaya
 */
public class Wallet implements IWallet {

    private int id;
    private int personId;
    private int totalAmount;

    public Wallet(int personId) {
        this.personId = personId;
        totalAmount = 0;
    }

    @Override
    public int balance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int withdraw(int money) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deposit(int money) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sendMoney(int money, Wallet destinationWallet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        public int getId() {
        return id;
    }

    public int getPersonId() {
        return personId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

}
