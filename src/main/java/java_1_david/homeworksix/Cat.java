package java_1_david.homeworksix;

public class Cat extends Animal {

    //кошка - 200 метров
    //кошка - не умеет плавать,
    //кошка - 2.0 метра

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
}
