/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiago
 */
public abstract class Observable {
    
    List<Observer> observers = new ArrayList<>();
    
    protected void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    
    protected void notifyObservers(Object object) {
        this.observers.forEach((observer) -> observer.update(this,object));
    }
}
