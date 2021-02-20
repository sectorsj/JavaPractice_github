package java_1_david.training.one;

public class FirstApp {

    public static void main(String[] args) {
        // System.out.println(30);
        // System.out.println(20.3);
        // System.out.println("Hi, Jack!!!");

        System.out.println(summ(5, 5));

        printSomeText();

        printMyText("Java");

        if (5 < 10){
            System.out.println("5 меньше 10");
        }
        if (10 < 5){
            System.out.println("Это сообщение никогда не будет выведено");
        }

        boolean bool = true;
        if (bool){
            System.out.println("победила правда");
        }if (!bool){
            System.out.println("правда не победила");
        }

    }

    public static int summ (int a, int b){
        return a + b;
    }

    public static void printSomeText(){
        System.out.println("Hello world!");
    }

    public static void printMyText (String txtToPrint){
        System.out.println(txtToPrint);
    }

}
