package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies;

import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters.Hero;

public class Ork extends Enemy {

    public Ork(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackArcher(Hero archer) {
        System.out.println(getName() + " нанес удар по " + archer.getName());
        archer.takeDamage(getDamage());
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
