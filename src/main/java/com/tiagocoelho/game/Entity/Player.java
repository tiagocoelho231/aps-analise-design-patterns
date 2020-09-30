package com.tiagocoelho.game.Entity;

public class Player extends Entity {

    public Player(String name, Integer maxHp) {
        super(name, maxHp);
    }

    @Override
    protected Integer getBaseAttack() {
        Integer attack = 1;
        
        return attack;
    }

    @Override
    protected Integer getBaseDefense() {
        Integer defense = 0;

        return defense;
    }

}
