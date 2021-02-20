package java_1_david.training.two;

import java.util.Arrays;

public class TrainingManual2 {

    public static void main(String[] args) {

        System.out.println("Оператор Switch");
        int a = 3;
        if (a == 1){
            System.out.println("a = 1");
        } else if (a == 3) {
            System.out.println("a == 3");
        }else {
            System.out.println("Ни одно из условий не сработало");
        }

        int b = 3;
        switch (b) {
            case 1:
                System.out.println("b = 1");
                break;
            case 3:
                System.out.println("b == 3");
                break;
            default:
                System.out.println("Ни одно из условий не сработало");
        }

        System.out.println("");
        System.out.println("Цикл FOR");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("end");

        System.out.println("");
        System.out.println("Цикл FOR с отрицательным счетчиком");
        int x;
        for (x = 10; x >= 0; x -= 5) {
            System.out.println(x + " ");
        }

        System.out.println("");
        System.out.println("Цикл FOR с несколькими управляющими переменными");
        for (int e = 0, r = 10; e < r; e++, r--){
            System.out.println("e-r: " + e + "-" + r);
        }

        System.out.println("");
        System.out.println("Оператор break");
        for (int t = 0; t < 10; t++) {
            if (t > 3) {
                break;
            }
            System.out.println("t = " + t);
        }
        System.out.println("");
        System.out.println("Цикл foreach");
        String[] sm = {"A", "B", "C", "D"};
        for (String o : sm) {
            System.out.print(o + " ");
        }
        System.out.println("");


        System.out.println("");
        System.out.println("Вложенные циклы");
        for (int f = 0; f < 3; f++) {
            for (int g = 0; g < 3; g++) {
                System.out.print(" " + f + g);
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("Вложенные циклы");
        for (int h = 0; h < 5; h++) {
            System.out.println(" ");
            System.out.println(" " + h +"A");
            for (int k = 0; k < 3; k++) {
                System.out.print("  " + k + "B");
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Кодовые блоки - предотвращение деления на 0");
        int a1 = 0, b1 = 10, c1 = 0;
        if (a1 != 0) {
            System.out.println("а не равно нулю");
            c1 = b1 / a1;
            System.out.println("b / a равно " + c1);
        } else {
            System.out.println("a = 0. На ноль делить нельзя!!!");
        }

        System.out.println("");
        System.out.println("Массивы");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("");
        System.out.println("Повторение №1");
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = i;
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        System.out.println("");
        System.out.println("Повторение №2");
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
            System.out.println("arr2 [" + i + "] = " +  arr2[i]);
        }

        System.out.println("");
        System.out.println("Повторение № 3");
        int [] arr3 = new int[3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
            System.out.println("arr3 [" + i + "] = " + arr3[i]);
        }

        System.out.println("");
        System.out.println("Массив чисел умножили на 10");
        int[] arr4 = new int[5];
        for (int i = 0; i <arr4.length; i++) {
            arr4[i] = i * 5;
        }
        for (int i = 0; i <arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        System.out.println("");
        System.out.println("Nums ");
        int [] nums = {5, 10, 15, 20};

        System.out.println("длинна массива = " + nums.length);

        for (int i = 0; i <nums.length; i++) {
            System.out.println("arr4 [" + i + "] = " + nums[i]);
        }

        System.out.println("");
        System.out.println("массив ABC в строку");
        String [] arrABC = {"A","B","C","D"};
        System.out.println(Arrays.toString(arrABC));


        System.out.println("");
        System.out.println("Массив Numbers в строку");
        int[] arr5 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(arr5));

    }
}
