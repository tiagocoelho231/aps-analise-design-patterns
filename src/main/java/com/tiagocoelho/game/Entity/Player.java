/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.game.Entity;

/**
 *
 * @author Tiago
 */
public class Player extends Entity {

    public Player(String name, Integer maxHp) {
        super(name, maxHp);
    }

    @Override
    protected Integer calculateAttack() {
        Integer attack = 1;
        
        return attack;
    }

    @Override
    protected Integer calculateDefense() {
        Integer defense = 0;

        return defense;
    }

}
