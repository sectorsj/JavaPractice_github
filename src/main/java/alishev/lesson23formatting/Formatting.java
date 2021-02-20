package alishev.lesson23formatting;

public class Formatting {
    public static void main(String[] args) {
        //System.out.println("Hello");        // println - переносит строку
        //System.out.println("Hello again");  // print - все в одну строку

        System.out.printf("This is a string, %s \n", "NICE");  //  printf - где (%s) это то место, куда должна попасть переменная типа String

        System.out.printf("This is a string, %d \n", 2);       //  %d Digit (цифра)

        System.out.printf("This is a string, %f \n", 2.2);     //  %f - flotting point number (дробь)

        System.out.printf("%f This is %s string, %d \n", 2.2, "Hobbit", 2000); // должна быть соблдена очередность

        System.out.printf("String %10d \n", 543); // ширина числа в 10 символов
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1000000000);

        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %-10d \n", 100000);
        System.out.printf("String %-10d \n", 1000000000);

        System.out.printf("String %.2f \n", 45.53);             //2 числа после запятой .ХХ и округляет
        System.out.printf("String %.2f \n", 45.5434);           //2 числа после запятой .ХХ и округляет
        System.out.printf("String %.2f \n", 45.5544545);        //2 числа после запятой .ХХ и округляет
        System.out.printf("String %.2f \n", 45.55547687665);    //2 числа после запятой .ХХ и округляет
    }
}
