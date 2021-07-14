package ru.sectorsj.learning.videoblogers.alishev.lesson29polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        // Animal animal = new Dog(); // собака рассматирвается как животное
        // animal.eat();

        // Dog dog = new Dog();  // собака рассматривается как собака
        // dog.eat();
        // dog.bark();

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        morphing(animal);
        morphing(dog);
        morphing(cat);
    }

    public static void morphing(Animal animal) {
        animal.eat();
    }

}
