package alishev.lesson37exceptionhandlingpart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {

    public static void main(String[] args)  {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }
        // File file = new File("test2");

        //try {
        //    Scanner scanner = new Scanner(file);
        //    System.out.println("После scanner");
        //} catch (FileNotFoundException e) {
        //    System.out.println("Файл не найден");
        //}
        //System.out.println("После блока try catch");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("dsdsd");
        Scanner scanner = new Scanner(file);
    }
}
