package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon;

public class Wand implements MagicWeapon {

    String name;

    public Wand(String name) {
        this.name = name;
    }

    @Override
    public int getDamage() {
        return 20;
    }

    @Override
    public String toString() {
        return name;
    }
}
