package alishev.lesson36readingfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        // при указании пути незабываем ставить ":" после диска
        String path = separator + "c:" + separator + "Users"+
                separator + "Администратор.000" +
                separator + "Desktop" + separator +
                "test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
