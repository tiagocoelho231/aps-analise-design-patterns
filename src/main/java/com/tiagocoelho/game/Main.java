package com.tiagocoelho.game;

import com.tiagocoelho.game.Entity.EntityFactory;
import com.tiagocoelho.game.Equipment.ArmorFactory;
import com.tiagocoelho.game.Equipment.WeaponFactory;
import com.tiagocoelho.game.Entity.Entity;

public class Main {

    public static void main(String[] args) {
        Entity p1 = EntityFactory.create("Player", "Tiago", 100);
        p1.setWeapon(WeaponFactory.create("Sword", "Rusty Sword", 8));
        p1.setArmor(ArmorFactory.create("Chainmail", "Poor Chainmail", 3));
        Entity e1 = EntityFactory.create("Enemy", "Goblin", 12);
        e1.setWeapon(WeaponFactory.create("Sword", "Greatsword", 10));
        e1.attack(p1);
        p1.attack(e1);

    }

}
