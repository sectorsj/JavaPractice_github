package ru.sectorsj.learning.videoblogers.chuev.lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExaple {

    private ABC abc;

    public void doSomething() {
        //  System.out.println(1/0);

        /*
            int array [] = {1,2,3};
            array[5] = 3;
        */

        //  try {
        //      abc.show();
        //  }catch (Exception e) {
        //      System.err.println("После объявления переменной не создан объект");
        //  }

        //  if (abc == null) {
        //      System.out.println("После объявления переменной не создан объект");
        //  }else {
        //      abc.show();
        //  }


        //  try {
        //      abc.show();
        //      System.out.println(1/0);
        //  }catch (NullPointerException | ArithmeticException e) {
        //      e.printStackTrace();
        //  }

        FileInputStream fileInputStream = null;


        try {
            fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
