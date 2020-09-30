package com.tiagocoelho.game.Equipment;

public class Chainmail extends Armor {

    public Chainmail(String name, Integer defense) {
        super(name, defense);
    }

    @Override
    public Integer applyArmorModifiers(Integer damage) {
        return Math.round(damage * 0.8f) - defense;
    }

}
