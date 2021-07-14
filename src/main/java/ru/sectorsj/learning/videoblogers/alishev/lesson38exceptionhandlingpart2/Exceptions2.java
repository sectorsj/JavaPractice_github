package ru.sectorsj.learning.videoblogers.alishev.lesson38exceptionhandlingpart2;

import java.util.Scanner;

public class Exceptions2 {

    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ноль");
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            // if (x != 0){
            //     try {
            //         throw new ScannerException();
            //     } catch (ScannerException e) {
            //         System.out.println("Вы ввели не ноль, введите ноль");
            //     }
            // }

            if (x != 0){
                throw new ScannerException("Вы ввели не ноль, введите ноль");
            }
        }
    }
}
