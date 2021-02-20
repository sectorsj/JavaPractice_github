package chuev.lesson31;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        ReadFiles rF = new ReadFiles();
        WriteFiles wF = new WriteFiles();

        rF.readFile();
        wF.writeFile();
    }
}