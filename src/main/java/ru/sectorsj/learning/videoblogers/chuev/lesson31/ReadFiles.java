package ru.sectorsj.learning.videoblogers.chuev.lesson31;

import java.io.*;

public class ReadFiles {

    public void readFile() {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        int b = 0;

        try {
            fis = new FileInputStream("D:/1.txt");   // недостаток, не читает русские символы
            isr = new InputStreamReader(fis, "UTF-8");
            while ((b = isr.read()) != -1 ) {
                System.out.print((char)b);
            }
            //  } catch (FileNotFoundException e) {
            //      e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
