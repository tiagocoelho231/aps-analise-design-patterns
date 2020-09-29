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
public class Enemy extends Entity {

    public Enemy(String name, Integer maxHp) {
        super(name, maxHp);
    }

    @Override
    protected Integer calculateAttack() {
        Integer attack = 2;

        return attack;
    }

    @Override
    protected Integer calculateDefense() {
        Integer defense = 1;

        return defense;
    }

}
