/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.concretes;

import core.abstracts.IBlock;
import user.concretes.Person;

/**
 *
 * @author EmreOzkaya
 */
public class Block implements IBlock {

    private int id;
    private String reason;
    private int blockTime;

    public Block() {}

    public int getBlockTime() {
        return blockTime;
    }

    public int getId() {
        return id;
    }

    public String getReason() {
        return reason;
    }

    public void setBlockTime(int blockTime) {
        this.blockTime = blockTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public void removeBlock(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void post(Block block) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Block block) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Block block) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void blockPerson(Person person, Block block) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
