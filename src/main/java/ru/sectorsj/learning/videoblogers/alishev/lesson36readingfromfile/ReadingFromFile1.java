package ru.sectorsj.learning.videoblogers.alishev.lesson36readingfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        //если файл создан в корне проекта, то не нужно париться с сепараторами

        //String separator = File.separator;
        //String path = separator + "c:" + separator + "Users"+ separator + "Администратор.000" + separator + "Desktop" + separator + "test1.txt";


        File file = new File("test2");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
