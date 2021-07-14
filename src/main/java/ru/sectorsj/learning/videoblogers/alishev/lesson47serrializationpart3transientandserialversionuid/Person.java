package ru.sectorsj.learning.videoblogers.alishev.lesson47serrializationpart3transientandserialversionuid;

import java.io.Serializable;

public class Person implements Serializable {

    // если мы изменяли структуру класса с serialVersionUID, то нужно перегенерировать поле serialVersionUID.
    private static final long serialVersionUID = -3206756948948451962L;
    private int id;
    private transient String name;
    private int age;

    // adding new variables
        // private String surname;
        // private byte type;
        // и т.д.

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return id + ": "+ " name: " + name + " age: " + age;
    }
}
