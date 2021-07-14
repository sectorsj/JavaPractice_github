package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies;

import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters.Hero;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.gamemechanics.Mortalable;

public abstract class Enemy<T> implements Mortalable {

    private String name;
    private int health;
    private int damage;
    private T weapon;


    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " погиб");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + ". Осталось " + health);
        }
    }

    public abstract void attackArcher(Hero archer);


    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
