package java_1_david.homeworktwo;

public class Main {

    public static void main (String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

            int[] array = new int[10];
            array[0] = 1;
            array[1] = 1;
            array[2] = 0;
            array[3] = 0;
            array[4] = 1;
            array[5] = 0;
            array[6] = 1;
            array[7] = 1;
            array[8] = 0;
            array[9] = 0;

            int arrlength = array.length;
            System.out.println("task1: ");

            for (int i = 0; i < arrlength; i++) {
                if (array[i] == 1) array[i] = 0;
                else array[i] = 1;
            }

            for (int i = 0; i < arrlength; i++) {
                System.out.println(i + " " + array[i]);
            }


        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;


            int[] array2 = new int[8];
            int step = 0;
            int arrlength2 = array2.length;

            System.out.println(" ");
            System.out.println("task2: ");


            for (int i = 0; i < arrlength2; ++i, step = step + 3) {
                array2[i] = step;

                System.out.println(array2[i]);
            }

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;

            int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int arrlength3 = array3.length;
            for (int i = 0; i < arrlength3; i++) {
                if (array3[i] < 6)
                    array3[i] = array3[i] * 2;
            }
            System.out.println(" ");
            System.out.println("task3: ");

            for (int i: array3) {
                System.out.print(i + " ");
            }
            System.out.print(" " + "сделал вертикально для разнообразия!");
            System.out.println(" ");

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

            int [][] array4 = new int[10][10];

        System.out.println(" ");
        System.out.println("task4: ");

            for (int i = 0; i < array4.length; i++) {
                for (int j = 0; j < array4.length; j++) {
                    array4[i][i] = 1;
                    array4[i][array4[i].length - i - 1] = 1;
                    System.out.print(array4 [i][j] + " ");
                }
                System.out.println();
            }

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);



        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.



        // 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций (Циклично).
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    }
}
