package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters;

import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon.MagicWeapon;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies.Enemy;

public class Mage<T extends MagicWeapon> extends Hero<T> {

    public Mage(String name,int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy goblin) {
        System.out.println(getName() + " сотворил заклинание на " + goblin.getName());
        goblin.takeDamage(getDamage());
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
