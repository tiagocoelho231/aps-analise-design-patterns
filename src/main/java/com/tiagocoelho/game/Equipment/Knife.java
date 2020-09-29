/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.game.Equipment;

public class Knife extends Weapon {

    public Knife(String name, Integer attack) {
        super(name, attack);
    }

    @Override
    public Integer applyWeaponModifiers(Integer damage) {
        return this.attack + Math.round(damage * 0.8f);
    }

}
