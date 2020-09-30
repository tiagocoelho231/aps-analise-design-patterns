package com.tiagocoelho.game.Entity;

public class EntityStateFactory {

    public static EntityState create(float hpPercentage) {
        if (hpPercentage < 0.2f) {
            return new Dying();
        } else {
            return new Stable();
        }
    }
}
