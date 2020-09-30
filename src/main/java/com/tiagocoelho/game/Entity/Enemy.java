package com.tiagocoelho.game.Entity;

public class Enemy extends Entity {

    public Enemy(String name, Integer maxHp) {
        super(name, maxHp);
    }

    @Override
    protected Integer getBaseAttack() {
        Integer attack = 2;

        return attack;
    }

    @Override
    protected Integer getBaseDefense() {
        Integer defense = 1;

        return defense;
    }

}
