/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.game.Equipment;

/**
 *
 * @author Tiago
 */
public abstract class Equipment {

    private String name;

    protected Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
