package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters;

import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.gamemechanics.Mortalable;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon.Weapon;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies.Enemy;

public abstract class Hero<T extends Weapon> implements Mortalable {

    private String name;
    private int health;
    private int damage;
    private T weapon;


    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " погиб");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + ". Осталось " + health);
        }
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
