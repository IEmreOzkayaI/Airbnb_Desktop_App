/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package user.abstracts;

import java.util.List;
import user.concretes.Person;

/**
 *
 * @author EmreOzkaya
 */
public interface IPersonnel {

    public List<Person> getAllIsActiveFalse();

    List<Person> getAllIsBlockTrue();
}
