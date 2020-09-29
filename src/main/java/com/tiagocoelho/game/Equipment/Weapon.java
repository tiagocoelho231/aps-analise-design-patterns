/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.game.Equipment;

/**
 *
 * @author Tiago
 */
public abstract class Weapon extends Equipment {

    protected Integer attack;

    public Weapon(String name, Integer attack) {
        super(name);
        this.attack = attack;
    }

    public abstract Integer applyWeaponModifiers(Integer damage);
}
