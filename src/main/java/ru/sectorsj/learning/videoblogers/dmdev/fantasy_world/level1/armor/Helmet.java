package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.armor;

public class Helmet implements Armor {

    String name;

    public Helmet(String name) {
        this.name = name;
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
