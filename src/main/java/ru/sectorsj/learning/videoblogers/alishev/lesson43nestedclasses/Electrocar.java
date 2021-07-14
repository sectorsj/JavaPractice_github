package ru.sectorsj.learning.videoblogers.alishev.lesson43nestedclasses;

public class Electrocar {
    private int id;

    // вложенный не статический класс
    private class Engine {
        public void startEngine() {
            System.out.println("Engine " + id + " is started");
        }
    }

    // статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Engine engine = new Engine();
        engine.startEngine();

        final int VALUE = 1;

        class SomeClass {
            public void someMethod() {
                System.out.println(VALUE);
                System.out.println(id);
            }
        }

        SomeClass someObj = new SomeClass();
        test(someObj);

        System.out.println("Electrocar " + id + " is starting up");
    }

    private void test(Object object) {

    }

}
