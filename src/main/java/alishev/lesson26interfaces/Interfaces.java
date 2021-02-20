package alishev.lesson26interfaces;

public class Interfaces {
    public static void main(String[] args) {

            //Пример 1
                // простая реализация интерфейса
        // Animal animal1 = new Animal(1);
        // Person person1 = new Person("Bob");
        // animal1.showInfo();
        // person1.showInfo();

            //Пример 2
                // можно создавать объект с ссылаясь на другой класс
                //только если есть связь как в этом примере,
                // тк в классах Animal Person
                //есть методы из интерфеса Info
        // Info info1 = new Animal(1);
        // Info info2 = new Person("Bob");
        // info1.showInfo();
        // info2.showInfo();

            //Пример 3
                // реализация метода outputInfo в объектах - Animal и Person
        // outputInfo(info1);
        // outputInfo(info2);

            //Пример 4
                // можно сделать так, потому что классы Animal и Person
                // реализуют класс Info
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);
    }
    public static void outputInfo(Info info){
        info.showInfo();    //может действовать на любой из объектов который реализует метод (Info)
    }
}
