package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.armor;

public class Bracers implements Armor{

    String name;

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
