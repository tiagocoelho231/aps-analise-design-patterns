/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.game.Equipment;

public class Sword extends Weapon {

    public Sword(String name, Integer attack) {
        super(name, attack);
    }

    @Override
    public Integer applyWeaponModifiers(Integer damage) {
        return attack + damage;
    }

}
