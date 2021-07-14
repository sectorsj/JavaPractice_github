package ru.sectorsj.learning.videoblogers.alishev.lesson48enam;

public class Test {
    public static void main(String[] args) {
        // Animal animal = Animal.CAT;
        // switch (animal) {
        //     case CAT:
        //         System.out.println("It's a cat");
        //         break;
        //     case DOG:
        //         System.out.println("It's a dog");
        //         break;
        //     case FROM:
        //         System.out.println("It's a frog");
        //         break;
        // }

        // Season season = Season.SUMMER;
        // switch (season) {
        //     case SPRING:
        //         System.out.println("It's spring time");
        //         break;
        //     case SUMMER:
        //         System.out.println("It's summer time");
        //         break;
        //     case AUTUMN:
        //         System.out.println("It's autumn time");
        //         break;
        //     case WINTER:
        //         System.out.println("It's winter time");
        //     default:
        //         System.out.println("It's not a season");
        // }

        //  Animal animal1 = Animal.CAT;
        //  Animal animal2 = Animal.DOG;
        //  System.out.println(animal1.getTranslation());
        //  System.out.println(animal2);
        //
        //  Season season = Season.WINTER;
        //  System.out.println(season.getTemperature());


//родительские методы enum
        // получаем имя enum
        Season season = Season.AUTUMN;
        Animal animal = Animal.CAT;
        System.out.println(season.name());
        System.out.println(animal.name());



        //получаем значение enum
        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());


        //получаем индекс enum
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}
