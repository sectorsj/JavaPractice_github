package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.armor;

public class SmallShield implements Shield {

    String name;

    public SmallShield(String name) {
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
