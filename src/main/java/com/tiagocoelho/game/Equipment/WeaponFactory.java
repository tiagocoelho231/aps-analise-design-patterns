package com.tiagocoelho.game.Equipment;

public class WeaponFactory {

    public static Weapon create(String type, String name, Integer attack) {
        switch (type) {
            case "Knife":
                return new Knife(name, attack);
            case "Sword":
                return new Sword(name, attack);
            default:
                return null;
        }
    }
}
