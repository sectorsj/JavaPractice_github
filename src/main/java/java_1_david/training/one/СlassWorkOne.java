package java_1_david.training.one;

public class СlassWorkOne {

    public static void main (String[] args){
        System.out.println("Классный урок");
        System.out.println("");
        System.out.println(classWorkOne(1, 2, 3));

        System.out.println("");
        System.out.println("Задание № 3");
        System.out.println("a * (b +(c / d) = " + calculate(2.0f, 3.3f, 6.1f, 2.4f));

        System.out.println("");
        System.out.println("Задание № 4");
        System.out.println(task10and20(4, 4));

        System.out.println("");
        System.out.println("Задание № 5");
        negativeOrPositive(0);

        System.out.println("");
        System.out.println("Задание № 6");
        System.out.println(isNegativeNumber(-1));

        System.out.println("");
        System.out.println("Задание № 7");
        greeting("John");

        System.out.println("");
        System.out.println("Задание № 7");
        isLeapYear(2020);

    }
    public static int classWorkOne (int r, int t, int p){

        if (r < t) {
            System.out.println("a меньше b");
        }
        if (r == t){
            System.out.println("a равно b, это сообщение не будет выведено!");
        }
        p = r - t;
        System.out.println("c = " + p);
        if (p >= 0) {
            System.out.println("c не отрицательно");
        }
        if (p < 0)  {
            System.out.println("c отрицательно");
        }
        p = t - r;
        System.out.println("c = " + p);
        if(p >= 0) {
            System.out.println("c не отрицательно");
        }
        if (p < 0) {
            System.out.println("c отрицателно");
        }
        return r;
    }

    public static float calculate (float a, float b, float c, float d){
        float result;
        result = a * (b +(c / d));
        return result;
    }

    public static boolean task10and20 (int a1, int b1) {
        int c;
        c = a1 + b1;
        if (c <= 10 && c < 20) {
            return true;
        } else
            return false;
    }

    public static void negativeOrPositive(int a2){
        if (a2 < 0){
            System.out.println("Число " + a2 + " - отрицательное");
        } else
            System.out.println("Число " + a2 + " - положительное");
    }

    public static boolean isNegativeNumber(int a3){
        if (a3 < 0){
            return true;
        }
        return false;
    }

    public static void greeting (String name){
        System.out.println("Привет " + name);
    }

    public static void isLeapYear(int f){
        if (f % 4 == 0 && f % 100 != 0 || f % 400 == 0){
            System.out.println(f + " високосный год!");
        }else
            System.out.println(f + " не високосный год!");
    }

}


