package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weaponrunner;

import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters.Archer;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon.Bow;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon.Sword;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters.Warrior;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<Bow>("Леголас", 100, 10);
        archer.setWeapon(new Bow("Супер точный лук"));

        Warrior<Sword> warrior = new Warrior<>("Боромир", 100, 15);
        warrior.setWeapon(new Sword("Супер пупер меч"));
    }
}
