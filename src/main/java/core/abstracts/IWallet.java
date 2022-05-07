/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core.abstracts;

import core.concretes.Wallet;
import user.concretes.Person;

/**
 *
 * @author EmreOzkaya
 */
public interface IWallet {
    int balance();
    int withdraw(int money);
    int deposit(int money); 
    void sendMoney(int money , Wallet destinationWallet);
}
