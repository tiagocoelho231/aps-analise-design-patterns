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
