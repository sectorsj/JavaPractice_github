package alishev.lesson20constructor;

public class Constructor {
    public static void main(String[] args) {
        Human human1 = new Human();                         // можно создать объект не поставляя в него параметры
                                                                            // или
        Human human2 = new Human("Bob");              // можно создать объект с параметрами (name, age) см. строку 21
        Human human3 = new Human("Tom", 30);
    }
}

class Human {
    private String name;
    private int age;

    // это - конструктор, так он выглядит (ПО УМОЛЧАНИЮ) и он с пустым телом
    // Правила:
    // 1. имя конструктор (Human) должно совпадать с именем класса;
    // 2. имя конструкора начинается с заглавной буквы как и у его класс (Human);

    // public Human() {
    //     System.out.println("имя объекта Human " + name + " - привет из 1го Конструктора");
    // }

    public Human() {
        this.name = "Имя по умолчанию";
        this.age = 0;
        System.out.println("имя объекта Human " + name + " - привет из 1го конструктора");
    }

    public Human (String name) {                             // Конструктор с 1 параметром
        System.out.println("имя объекта Human " + name + " - привет из 2го конструктора");
        this.name = name;
    }

    public Human (String name, int age) {                   // Конструктор с более чем 1 параметром
        System.out.println("имя объекта Human " + name + " - привет из 3го конструктора");
        this.name = name;
        this.age = age;
    }
    // то, что мы сделали в строках 15 по 36 - это перегрузка методов (2 и более методов с разными параметрами)


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) { this.age = age; }

}