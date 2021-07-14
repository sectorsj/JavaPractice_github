package ru.sectorsj.learning.videoblogers.alishev.lesson46serrialization2partarrays.firstmethod;

import ru.sectorsj.learning.videoblogers.alishev.lesson46serrialization2partarrays.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectFirst {
    public static void main(String[] args) {
        Person[] peoples = {
                new Person(1, "Bob"),
                new Person(2, "Mal"),
                new Person(3, "Tom"),
        };

        try {
            FileOutputStream fos = new FileOutputStream("peoples.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(peoples.length);

            for (Person person : peoples) {
                oos.writeObject(person);
            }

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
