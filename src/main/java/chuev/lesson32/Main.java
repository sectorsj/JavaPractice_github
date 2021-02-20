package chuev.lesson32;

import java.io.InvalidObjectException;

public class Main {

    public static void main(String[] args) {

        // Cat cat = new Cat();
        // cat.setName("Tom");


        Serializator serializator = new Serializator();

        //System.out.println(serializator.serialization(cat));
        try {
            Cat cat = serializator.deserialization();
            System.out.println(cat.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
