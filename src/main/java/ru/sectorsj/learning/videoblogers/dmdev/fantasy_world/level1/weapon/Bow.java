package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon;

public class Bow implements RangeWeapon {

    String name;

    public Bow(String name) {
        this.name = name;
    }

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public String toString() {
        return name;
    }
}
