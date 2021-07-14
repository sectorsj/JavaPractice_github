package ru.sectorsj.learning.books.oreily.java.xCopy_118;

public class XCopy {
    public static void main(String[] args) {
        int original = 42;
        XCopy x = new XCopy();
        int y = x.go(original);
        System.out.println(original + "." + y);
    }

    int go (int arg) {
        arg = arg * 2;
        return arg;
    }
}
