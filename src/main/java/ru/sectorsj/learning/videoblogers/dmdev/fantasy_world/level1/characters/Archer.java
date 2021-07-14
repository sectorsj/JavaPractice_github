package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters;

import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon.RangeWeapon;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies.Enemy;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    private Wolf wolf;

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy goblin) {
        System.out.println(getName() + " выстрелил из лука " + getWeapon() + " в " + goblin.getName());
        //goblin.takeDamage(getDamage());
        wolf.attackEnemy(goblin);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    public class Wolf {

        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy (Enemy goblin) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон");
            goblin.takeDamage(damage + Archer.this.getDamage());
        }
    }
}
