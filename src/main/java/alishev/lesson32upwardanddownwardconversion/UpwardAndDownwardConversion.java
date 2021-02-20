package alishev.lesson32upwardanddownwardconversion;

public class UpwardAndDownwardConversion {
    public static void main(String[] args) {

        // Upcasting - восходящее преобразование
        // неявное

        // Animal animal = new Dog();
        // Dog dog = new Dog();
        // Animal animal = dog;

        // Downcasting - низходящее преобразование
        // явное
        // Dog dog2 = (Dog) animal;

        Animal a = new Animal(); // низходящее преобразование не безопасно
        Dog dog = (Dog) a;       //это пример
        dog.bark();
    }
}
