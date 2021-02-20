package java_1_david.training.one;

public class MainClass {

    public static void main (String[] args){
        System.out.print("п.3 - ");
        System.out.println(calcResult(2f, 3f, 4f, 3f));

        System.out.print("п.4 - ");
        calcSumm(19, 1);

        System.out.print("п.4 (вариант 2) - ");
        System.out.println(calcSumm2(8, 2));

        System.out.print("п.5 - ");
        isPositive(2);

        System.out.print("п.5 (вариант 2) - ");
        int value = -2;
        System.out.println("число " + value + " " + (isPositive2(value) ? "ПОЛОЖИТЕЛЬНОЕ" : "ОТРИЦАТЕЛЬНОЕ") );

        System.out.print("п.6 - ");
        positiveOrNegative(-1);

        System.out.print("п.6 (вариант 2) - ");
        System.out.println(positiveOrNegative2(2));

        System.out.print("п.7 - ");
        greeting("Егор");

        System.out.print("п.7 (вариант 2) - ");
        String myName = "Руди";
        greeting(myName);

        System.out.print("п.8* - ");
        isLeapYear(400);

        System.out.print("п.8* (вариант 2) - ");
        int year = 2004;
        System.out.println("ГОД " + year + " - " + (isLeapYear2(year) ? "ВИСОКОСНЫЙ": "НЕ ВИСОКОСНЫЙ") );

        /*можно тернарный оператор вывести отдельно*/
        //int year = 2004;
        //String isLeapStr = isLeapYear2(year) ? "ВИСОКОСНЫЙ": "НЕ ВИСОКОСНЫЙ";
        //System.out.println("ГОД " + year + " - " + isLeapStr);

        /*эта конструция менее предпочтиельна*/
        System.out.print("п.8* (вариант 3) - ");
        String str;
        if (isLeapYear2(year)) {
            System.out.println(str = "Leap");
        } else {
            System.out.println(str = "Not leap");
        }


    }
    /*п.3*/
    private static float calcResult (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /*п.4*/
    private static boolean calcSumm (int a, int b) {
        int resultSumm = a + b;
        System.out.println(resultSumm >= 10 && resultSumm <= 20);
        return resultSumm >= 10 && resultSumm <= 20;
    }

    /*п.4 вариант2 через Boolean - улучшенный*/
    private static boolean calcSumm2 (int firstValue, int secondValue) {
        int Summ = firstValue + secondValue;
        return Summ >= 10 && Summ <= 20;
    }

    /*п.5*/
    private static void isPositive(int a) {
        if (a >= 0){
            System.out.println("число " + a + " - положительное");
        } else
            System.out.println("число " + a + " - отрицательное");
    }
    /* п.5 вариант2 через Boolean - улучшенный*/
    private static boolean isPositive2 (int value){
        return value > 0;
    }

    /*п.6*/
    private static void positiveOrNegative (int a) {
        if (a < 0) {
            System.out.println("true");
        } else
        System.out.println("false");
    }

    /* п.6 вариант2 через Boolean - улучшенный*/
    private static boolean positiveOrNegative2 (int a) {
        return a < 0;
    }

    /*п.7*/
    private static void greeting (String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*п. 8*/
    private static void isLeapYear (int a){
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Год " + a + " високосный");
        } else
            System.out.println("Год " + a + " не високоcный");
    }
    /*вариант 2 - более лучший*/
    private static boolean isLeapYear2 (int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

}


