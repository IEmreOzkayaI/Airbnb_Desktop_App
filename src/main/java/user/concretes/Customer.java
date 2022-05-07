/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.concretes;

import advertisement.abstracts.House;
import advertisement.concretes.Comment;
import core.concretes.Block;
import core.concretes.Wallet;
import java.util.List;
import user.abstracts.ICustomer;

/**
 *
 * @author EmreOzkaya
 */
public class Customer extends Person implements ICustomer {

    private Wallet wallet;
    private House rentedHouse;
    private List<Comment> comments;
    private Personnel activationPersonnel;
    private boolean activationResult;
    private boolean isBlocked;

    public Customer() {
        super();
        wallet = new Wallet(this.getId());
        rentedHouse = null;
        comments = null;
        activationPersonnel = null;
        activationResult = false ;
        isBlocked = false;
    }

    @Override
    public boolean register(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void blockPerson(Person person, Block block) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Person> getAllIsBlockTrue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
