package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters;

import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies.Enemy;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ударил мечом " + getWeapon()+ " " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
