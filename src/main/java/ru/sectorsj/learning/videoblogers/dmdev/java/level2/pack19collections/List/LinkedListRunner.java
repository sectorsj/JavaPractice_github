package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack19collections.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRunner {
    public static void main(String[] args) {

        List<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        System.out.println(integers.get(5));
        System.out.println(integers.contains(40));
    }
}
