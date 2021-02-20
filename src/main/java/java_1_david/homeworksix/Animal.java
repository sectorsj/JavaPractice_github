package java_1_david.homeworksix;

public class Animal {
    void family (String name) {
        System.out.println(name);
    }

    void toRun (int distance) {
        System.out.println("Бежит");
    }

    void toJump (float height) {
        System.out.println("Перепрыгивает препятствие");
    }

    final int limit () {
        return (int) ((Math.random() * 401));
    }

}


