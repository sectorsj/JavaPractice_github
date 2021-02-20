package java_1_david.training.two;

public class MainClassHomeWork {
    public static void main (String[] args) {

        System.out.print("п.1 -");
        array1();
        System.out.println("");

        System.out.print("п.2 - ");
        array2();
        System.out.println("");

        System.out.print("п.3 - ");
        array3();
        System.out.println("");

        System.out.print("п.4 - ");
        System.out.println("");
        array4();



    }



    private static void array1() {
        int[] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 1;
        arr1[2] = 0;
        arr1[3] = 0;
        arr1[4] = 1;
        arr1[5] = 0;
        arr1[6] = 1;
        arr1[7] = 1;
        arr1[8] = 0;
        arr1[9] = 0;

        int i;
        for (i = 0; i < arr1.length; i++) {
            //System.out.println(arr1[i]);
            if (arr1[i] == 1) {
            arr1[i] = 0;
            System.out.print(" " + arr1[i]);
            } else {
                arr1[i] = 1;
                System.out.print(" " + arr1[i]);
            }
        }System.out.println("");
    }

    private static void array2() {
        int[] arr2 = new int[8];

        int i;
        int step = 0;
        for (i = 0; i < arr2.length; i++, step = step + 3) {
            arr2[i] = step;
            System.out.print(arr2[i] + " ");
        }System.out.println("");
    }

    private static void array3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
                System.out.print(arr3[i] + " ");
            } else {
                System.out.print(arr3[i] + " ");
            }
        }System.out.println("");
    }

    private static void array4() {
        int[][] arr4 = new int[10][10];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i > j) {
                    arr4[i][j] = 0;
                } else if (i < j) {
                    arr4[i][j] = 0;
                } else {
                    arr4[i][j] = 1;
                }System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }
}
