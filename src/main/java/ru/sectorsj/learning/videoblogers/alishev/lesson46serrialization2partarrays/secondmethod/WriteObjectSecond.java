package ru.sectorsj.learning.videoblogers.alishev.lesson46serrialization2partarrays.secondmethod;

import ru.sectorsj.learning.videoblogers.alishev.lesson46serrialization2partarrays.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectSecond {
    public static void main(String[] args) {
        Person[] hobbits = {
                new Person(1, "Frodo"),
                new Person(2, "Sam"),
                new Person(3, "Merry"),
                new Person(4, "PerryGreen"),
        };

        try {
            FileOutputStream fos = new FileOutputStream("hobbits.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(hobbits);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
