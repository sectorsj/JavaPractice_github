package ru.sectorsj.learning.videoblogers.alishev.lesson24objectclassandtostringmethod;

public class ObjectClassAndToStringMethod {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        // System.out.println(h1);
        System.out.println(h1.toString()); // это тоже самое что и в строке 7

    }
}
class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name+", "+age;
    }
}