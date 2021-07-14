package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon;

public class Sword implements MeleeWeapon {

    String name;

    public Sword(String name) {
        this.name = name;
    }

    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public String toString() {
        return name;
    }
}
