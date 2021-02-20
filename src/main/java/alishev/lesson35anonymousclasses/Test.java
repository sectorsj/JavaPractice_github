package alishev.lesson35anonymousclasses;

// нет смысл создавать потомок класса, который имеет ограниченные возможности
// class Animal {
//     public void eat(){
//         System.out.println("Animal is eating...");
//     }
// }

// что бы создать анонимный класс нужно убрать этот лишний класс
    //  class OtherAnimal extends Animal{
    //      public void eat() {
    //          System.out.println("Other animal is eating");
    //      }
    //  }

interface AbleToEat {
    public void eat();
}

    //  class Animal35 implements AbleToEat {
    //      @Override
    //      public void eat() {
    //          System.out.println("gdfdfgdfg");
    //      }
    //  }

public class Test {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // animal.eat();

        // убираем неактуальный метод класса
        //  OtherAnimal otherAnimal = new OtherAnimal();
        //  otherAnimal.eat();

        // Animal animal2 = new Animal(){
        //     public void eat() {
        //         System.out.println("Other animal is eating");
        //     }
        // };
        // animal2.eat();

        // AbleToEat ableToEat = new Animal35();
        // ableToEat.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("someone is eating");
            }
        };
        ableToEat.eat();
    }
}
