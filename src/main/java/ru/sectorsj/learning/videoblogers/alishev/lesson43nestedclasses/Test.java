package ru.sectorsj.learning.videoblogers.alishev.lesson43nestedclasses;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();
        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
