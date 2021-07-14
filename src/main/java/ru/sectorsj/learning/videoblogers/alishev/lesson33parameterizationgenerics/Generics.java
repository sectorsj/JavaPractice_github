package ru.sectorsj.learning.videoblogers.alishev.lesson33parameterizationgenerics;

import java.util.ArrayList;
import java.util.List;


public class Generics {
    public static void main(String[] args) {

        ////////////////  before JAVA5  ///////////////////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog"); // 1
        animals.add("frog");
        animals.add(ourAnimal);


        String animal = (String) animals.get(1);
        System.out.println(animal);

        ////////////////after JAVA5 (Generics)  ///////////////////
        List<String> animals2 = new ArrayList<String>();  // после 7 java можно не писать тип String
        animals2.add("genericCat");
        animals2.add("genericDog");
        animals2.add("genericFrog");
        // animals2.add(ourAnimal);

        String animal2 = animals2.get(1);

        ////////////////  JAVA7  ///////////////////
        List<String> animal3 = new ArrayList<String>();
    }
}

class Animal {

}
