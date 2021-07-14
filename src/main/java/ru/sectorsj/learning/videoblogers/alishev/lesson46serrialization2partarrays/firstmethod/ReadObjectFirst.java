package ru.sectorsj.learning.videoblogers.alishev.lesson46serrialization2partarrays.firstmethod;

import ru.sectorsj.learning.videoblogers.alishev.lesson46serrialization2partarrays.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectFirst {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("peoples.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
            Person[] peoples = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                peoples[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(peoples));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
