package com.tiagocoelho.game.Equipment;


public class Leather extends Armor {

    public Leather(String name, Integer defense) {
        super(name, defense);
    }

    @Override
    public Integer applyArmorModifiers(Integer damage) {
        return Math.round(damage * 0.9f) - defense;
    }
    
}
