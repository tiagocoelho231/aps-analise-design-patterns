package com.tiagocoelho.game.Entity;

public class EntityFactory {
    public static Entity create(String type, String name, Integer hp) {
        switch(type) {
            case "Player":
                return new Player(name, hp);
            case "Enemy":
                return new Enemy(name, hp);
            default:
                return null;
        }
    }
}
