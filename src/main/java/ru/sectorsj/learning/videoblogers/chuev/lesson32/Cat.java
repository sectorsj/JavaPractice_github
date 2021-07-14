package ru.sectorsj.learning.videoblogers.chuev.lesson32;

import java.io.Serializable;

public class Cat implements Serializable {

    // private static final long serialVersionUID = 1L;   // узнать что это такое

    private String name;
    private static String a = "miyu";
    private transient String b = "ahh";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
