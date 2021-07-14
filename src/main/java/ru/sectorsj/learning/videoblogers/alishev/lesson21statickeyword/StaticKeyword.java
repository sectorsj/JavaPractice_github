package ru.sectorsj.learning.videoblogers.alishev.lesson21statickeyword;

public class StaticKeyword {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Tom", 20);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human h3 = new Human("Ron", 25);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();

        // Human.description = "Nice";
        // h1.getAllFied();
        // h2.getAllFied();
        // Human.getDescription();  // обращение к методу - public static void getDescription
        // Human.description = "Bad";      // обращаемся к description не через объект (h1), а через класс (Human)
        // h1.getAllFied();
        // h2.getAllFied();

        // System.out.println(Math.pow (2,4));   // коллекции методов
        // System.out.println(Math.PI);
    }
}

class Human {
    private String name;    // это переменная объекта
    private int age;        // это тоже переменная объекта
                            // переменные объекта - потому что они инициализируются, когда создается конкретный объект
                            // Например - Human human1 = new Human(); и относится именно к human1.
    // public static String description;

    private static int countPeople = 0;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++; // эквивалентно -> countPeople = countPeople + 1;
    }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    // public static void getDescription() {
    //     System.out.println(description);
    // }

    // public void getAllFied() {
    //     System.out.println(name + ", " + age + ", " + description);
    // }

    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}
