package ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1;

import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters.Archer;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters.Hero;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters.Mage;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.characters.Warrior;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies.Enemy;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies.Goblin;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies.Ork;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.enemies.Throll;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon.Bow;
import ru.sectorsj.learning.videoblogers.dmdev.fantasy_world.level1.weapon.Sword;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Боромир", 100, 15);
        warrior.setWeapon(new Sword("Палач"));
        Hero mage = new Mage("Гэндальф", 100, 20);
        Archer archer = new Archer("Леголас",100, 10);
        archer.setWeapon(new Bow("Разящий орков"));

        //Если вложенный класс Wolf был бы public, то
        Archer.Wolf wolf2 = archer.new Wolf("Wolf2", 11);


        Enemy goblin1 = new Goblin("Гоблин1", 50, 10);
        Enemy goblin2 = new Goblin("Гоблин2", 50, 10);
        Enemy ork = new Ork("Азог", 80, 8);
        Enemy throll = new Throll("Большой нос", 100, 17);

        attackEnemy(goblin1, warrior, mage, archer);
        attakeArcher(archer, goblin2, ork, throll);
    }

    public static void attackEnemy(Enemy goblin, Hero... heroes) {
        while (goblin.isAlive()){
            for (Hero hero : heroes) {
                if (goblin.isAlive()) {
                    hero.attackEnemy(goblin);
                }
            }
        }
    }

    public static void attakeArcher(Hero archer, Enemy... enemies) {
        while (archer.isAlive()){
            for (Enemy enemy : enemies) {
                if (archer.isAlive()) {
                    enemy.attackArcher(archer);
                }
            }
        }
    }


}
