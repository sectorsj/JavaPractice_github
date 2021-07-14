package ru.sectorsj.learning.videoblogers.alishev.lesson47serrializationpart3transientandserialversionuid;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        /**
         * use try with resources
         * */
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {

            Person person1 = (Person) ois.readObject();
            System.out.println(person1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
