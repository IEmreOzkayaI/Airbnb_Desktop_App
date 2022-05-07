/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core.abstracts;

import core.concretes.Block;
import user.concretes.Person;

/**
 *
 * @author EmreOzkaya
 */
public interface IBlock {
    void post(Block block);
    void delete(Block block);
    void update(Block block);
    void blockPerson(Person person , Block block);
    void removeBlock(Person person);
    
}
