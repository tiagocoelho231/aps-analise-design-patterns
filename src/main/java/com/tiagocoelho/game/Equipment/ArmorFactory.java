package com.tiagocoelho.game.Equipment;

public class ArmorFactory {

    public static Armor create(String type, String name, Integer defense) {
        switch (type) {
            case "Leather":
                return new Leather(name, defense);
            case "Chainmail":
                return new Chainmail(name, defense);
            default:
                return null;
        }
    }
}
