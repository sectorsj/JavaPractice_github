package ru.sectorsj.learning.videoblogers.alishev.lesson46serrialization2partarrays.secondmethod;

import ru.sectorsj.learning.videoblogers.alishev.lesson46serrialization2partarrays.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectSecond {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("hobbits.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] hobbits = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(hobbits));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
