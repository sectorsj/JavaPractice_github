package java_1_david.training.two;

public class MainClass {
    public static void main(String[] args) {

        printPifagorTable(10);
        System.out.println("");

        int max;
        int x = 12;
        int y = 5;

        if (x > y) {
            max = x;
            System.out.println(max);
        } else {
            max = y;
            System.out.println(max);
        }

        max = x > y ? x : y;


        System.out.println("");
        System.out.println("While (условный оператор):");
        int res = 0;
        while (res < 10) {
            System.out.print(res + "res ");
            res++;
        }
        System.out.println("");


        System.out.println("");
        System.out.println("For:");
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("Foreach (только для массивов и коллекций):");
        String[] strArr = {"Java", "Language", "GB", "cycle"};
        for (String s : strArr) {
            System.out.print(s + " ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("как объявлять массивы (Array):");

        int[] arr1 = new int[5];
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(j + " ");
        }
        System.out.println("");

        // int[] arr2 = new int[2];
        // String[] s = new String[3];
        // Array[] arr3 = new Array[4];


        System.out.println("");
        for (int i = 1; i < 10; i++) {
            System.out.print("in = " + i + ";");
            if (i % 2 == 0) {
                System.out.println("continue; ");
                continue;
            }
            // сложная логика на 30 строк
            System.out.println("out = " + i);
        }


    }

    public static void printPifagorTable(int value) {
        for (int i = 1; i < value + 1; i++) {
            for (int j = 1; j < value + 1; j++) {
                System.out.printf("%4d", i * j); // .printf("%3d") -форматирование текста...
            }
            System.out.println();
        }
    }




}
