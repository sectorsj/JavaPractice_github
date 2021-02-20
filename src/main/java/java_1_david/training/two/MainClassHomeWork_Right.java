package java_1_david.training.two;


public class MainClassHomeWork_Right {
    public static void main (String[] args) {

        //System.out.print("п.1 -");
        //System.out.print(swapZeroOneValues (new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}));
        // System.out.println(swapZeroOneValues);
        //
        // System.out.print("п.2 - ");
        //System.out.println(fillArrayByThree(new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}));
        // int[] arr2 = new int[8];
        // ;
        // System.out.println("");
        //
        // System.out.print("п.3 - ");
        // int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // multiplyArrValues();
        // System.out.println("");

        // System.out.print("п.4 - ");
        // int n = 10;
        // int[][] arr4 = new int[n][n];
        // System.out.println("");
        // fildDiagonal();
    }

    private static void swapZeroOneValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0){
                arr[i] = 1;
            }
        }
    }

    private static void fillArrayByThree(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    private static void multiplyArrValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

   // private static void fildDiagonal(int[] arr) {
   //     for (int i = 0; i < arr.length; i++) {
   //         arr[i][i] = 1;
   //         arr[i][arr[i].length - i - 1] = 1;
   //     }
   // }






}
