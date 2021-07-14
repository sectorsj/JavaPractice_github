package ru.sectorsj.learning.videoblogers.chuev.lesson31;

import java.io.*;

public class WriteFiles {

    public void writeFile() {

        FileWriter fr = null;
        String str = " No no, it is Java!";
        File file = new File("D:/2.txt");

        try {
            fr = new FileWriter(file, true);

            fr.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
