package ru.sectorsj.learning.videoblogers.alishev.lesson34wildcardsgeneric;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<Animal>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<Dog>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);
    }


    private static void test(List<? extends /*super*/ Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
