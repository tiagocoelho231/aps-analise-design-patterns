package com.tiagocoelho.game.Entity;

import com.tiagocoelho.game.Equipment.Armor;
import com.tiagocoelho.game.Equipment.Weapon;

public abstract class Entity {

    private String name;
    private Integer maxHp;
    private Integer hp;
    private EntityState state;
    protected Weapon weapon;
    protected Armor armor;

    public Entity(String name, Integer maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.state = EntityStateFactory.create(1f);
    }

    public String getName() {
        return name;
    }

    private void setHp(Integer hp) {
        this.hp = hp;
        System.out.println(this.name + " has " + this.hp + "HP.");
        this.setState(hp);
    }

    private void setState(Integer hp) {
        EntityState newState = EntityStateFactory.create((float) hp / (float) maxHp);
        if (newState.getClass() != this.state.getClass()) {
            this.state = EntityStateFactory.create((float) hp / (float) maxHp);
            System.out.println(this.name + " is now " + this.state.getName() + ".");
        }
    }

    protected abstract Integer getBaseAttack();

    protected abstract Integer getBaseDefense();

    protected void receiveAttack(Integer damage) {
        Integer damageDealt = damage - getBaseDefense();

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
        Integer damage = getBaseAttack();
        if (this.weapon != null) {
            damage = this.weapon.applyWeaponModifiers(damage);
        }

        damage = this.state.applyStateAttackModifier(damage);

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
