package ru.sectorsj.learning.videoblogers.alishev.lesson16returnmethodtype;

public class ReturnMethodType {
    public static void main(String[] args) {
       Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        //person1.calculateYearsToRetirement();  //для void метода
        //person2.calculateYearsToRetirement();  //для void метода
        // System.out.println(person1.calculateYearsToRetirement());    //для int метода
        int year1 = person1.calculateYearsToRetirement();               //тоже для int метода
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: " + year1 + " лет");
        System.out.println("Первому человеку до пенсии: " + year2 + " лет");

    }
}
class Person {
    String name;
    int age;

    // void calculateYearsToRetirement(){
    //     int years = 65-age;
    //     System.out.println("Количество лет до пенсии: "+ years);
    // }

     int calculateYearsToRetirement(){
         int years = 65-age;
         return years;
     }


    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут "+ name + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}
