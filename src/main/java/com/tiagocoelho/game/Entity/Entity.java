package com.tiagocoelho.game.Entity;

import com.tiagocoelho.game.Equipment.Armor;
import com.tiagocoelho.game.Equipment.Weapon;
import com.tiagocoelho.game.Observable;

public abstract class Entity extends Observable {

    private String name;
    private Integer maxHp;
    private Integer hp;
    protected Weapon weapon;
    protected Armor armor;

    public Entity(String name, Integer maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public String getName() {
        return name;
    }

    private void setHp(Integer hp) {
        this.hp = hp;
        System.out.println(this.name + " has " + this.hp + "HP");
        this.notifyObservers(hp);
    }

    protected abstract Integer calculateAttack();

    protected abstract Integer calculateDefense();

    protected void receiveAttack(Integer damage) {
        Integer damageDealt = damage - calculateDefense();

        if (this.armor != null) {
            damageDealt = this.armor.applyArmorModifiers(damageDealt);
        }

        if (damageDealt <= 0) {
            damageDealt = 1;
        }
        
        System.out.println(this.name + " received " + damageDealt + " damage.");
        this.setHp(hp - damageDealt);
    }

    public void attack(Entity target) {
        Integer damage = calculateAttack();
        if (this.weapon != null) {
            damage = this.weapon.applyWeaponModifiers(damage);
        }
        System.out.println(this.name + " dealt " + damage + " damage.");
        target.receiveAttack(damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

}
