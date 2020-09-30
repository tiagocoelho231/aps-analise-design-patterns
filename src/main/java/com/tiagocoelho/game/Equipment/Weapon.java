package com.tiagocoelho.game.Equipment;

public abstract class Weapon extends Equipment {

    protected Integer attack;

    public Weapon(String name, Integer attack) {
        super(name);
        this.attack = attack;
    }

    public abstract Integer applyWeaponModifiers(Integer damage);
}
