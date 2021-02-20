package alishev.lesson25inheritance;

public class DoInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        animal.sleep();
        dog.sleep();
        dog.eat();
        dog.bark();
        dog.showName();
    }
}
