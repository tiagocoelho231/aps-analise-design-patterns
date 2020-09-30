package com.tiagocoelho.game.Equipment;

public abstract class Armor extends Equipment {

    protected Integer defense;

    public Armor(String name, Integer defense) {
        super(name);
        this.defense = defense;
    }

    public abstract Integer applyArmorModifiers(Integer damage);
}
