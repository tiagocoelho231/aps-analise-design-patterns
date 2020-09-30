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
