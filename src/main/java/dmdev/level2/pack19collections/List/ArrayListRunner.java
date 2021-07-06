package dmdev.level2.pack19collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(5);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        System.out.println(6+4);
        System.out.println(integers.get(5));
        System.out.println(integers.contains(4));
        System.out.println(integers.contains(40));
    }
}
