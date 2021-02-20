package java_1_david.homeworksix;

public class Main {

    public static void main(String[] args){

        // бежать, плыть, перепрыгивать препятствие
        // собака - 500 метров
        // собака - 10 метров
        // собака - 0.5 метра
        //кошка - 200 метров
        //кошка - не умеет плавать,
        //кошка - 2.0 метра

        SwimingAnimal dog = new Dog();
        dog.family("dog");
        dog.toRun(300);
        dog.toJump(0.5f);
        dog.toSwim(10);

        System.out.println("");
        Animal cat = new Cat();
        cat.family("cat");
        cat.toRun(201);
        cat.toJump(2.4f);
    }
}