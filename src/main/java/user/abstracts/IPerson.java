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

    boolean logIn(Person person);

    public List<Person> getAllIsActiveFalse();
}
