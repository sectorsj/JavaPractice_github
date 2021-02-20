package alishev.lesson41abstractclass;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
        cat.makeSound();
        // dog.eat(); don't have method eat from Animal class
        cat.eat();
    }
}
