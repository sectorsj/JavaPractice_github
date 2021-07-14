package ru.sectorsj.learning.videoblogers.alishev.lesson25inheritance;

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void bark() {
        System.out.println("Dog is barking...");
    }

    public void showName() {
        System.out.println(name);
    }
}
