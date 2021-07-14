package ru.sectorsj.learning.videoblogers.chuev.lesson14;

public class MyArrays {

    public void playWithArrays() {
        MyArrays myArrays = new MyArrays();
        myArrays.initFirstArray();
        myArrays.initSecondArray();
        myArrays.initThirdArray();
        myArrays.initFourthArray();
        myArrays.initFifthArray();
    }

    private void initFirstArray() {
        System.out.println("первый вариант инициализации массива");

        int[] array = new int[5];

        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    private void initSecondArray() {
        System.out.println("\nвторой вариант инициализации массива");

        int[] array = new int[5];

        for (int i = 0; i <array.length; i++) {
            array[i] = i*10;
            System.out.println(array[i]);
        }
    }

    private void initThirdArray() {
        System.out.println("\nтретий вариант инициализации массива");

        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
            array[i] = i + 6;
            System.out.println(array[i]);
        }
    }


    private void initFourthArray() {
        System.out.println("\nчетвертый вариант инициализации массива");

        Apple[] box = new Apple[5];
        for (int i = 0; i < box.length; i++){
            System.out.println(box[i]);
        }
    }

    private void initFifthArray() {
        System.out.println("\nпятый вариант инициализации массива");
        Apple firstApple = new Apple();
        Apple secondApple = new Apple();
        Apple thirdApple = new Apple();

        Apple[] box = {firstApple,secondApple,thirdApple};
        for (int i = 0; i < box.length; i++) {
            System.out.println(box[i]);
        }
    }
}
