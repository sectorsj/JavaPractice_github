package java_1_david.homeworksix;

public class Dog extends SwimingAnimal {
//500 метров
//10 метров
//0.5 метра

    @Override
    void family(String name) {
        super.family(name);
    }

    @Override
    void toRun(int distance) {
        if (distance > super.limit()) {
            System.out.println("не может пробежать");
        } else {
            System.out.println("бежит");
        }
    }

    @Override
    void toJump(float height) {
        if (height > 0.5f) {
            System.out.println("не может прыгнуть");
        } else {
            System.out.println("прыгает");
        }
    }

    @Override
    void toSwim(int distance) {
        if (distance > 10 || distance < 0) {
            System.out.println("не может плыть");
        } else {
            System.out.println("плывет");
        }
    }

}
