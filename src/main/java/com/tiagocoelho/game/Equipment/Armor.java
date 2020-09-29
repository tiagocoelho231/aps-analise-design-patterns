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
public abstract class Armor extends Equipment {

    protected Integer defense;

    public Armor(String name, Integer defense) {
        super(name);
        this.defense = defense;
    }

    public abstract Integer applyArmorModifiers(Integer damage);
}
