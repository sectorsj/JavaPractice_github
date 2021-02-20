package java_1_david.training.one;

public class Training1 {

    byte b = 125;
    short s = 32000;
    int t = 2146444004;
    long l = 4433244343434243434L;
    float f = 1.20f;
    double d = 123.123;
    char h = '*';
    boolean n = true;

    public static void main(String[] args) {
        final int u = 20;
        float t;
        t = 2.25f;
        System.out.println("");
        System.out.println("Простая задача в java");
        float radius = 2.0f, height = 10.0f;
        float volume = 3.1416f * radius * radius * height;
        System.out.println("Объем цилиндра равен = " + volume);

        int x, y, z;
        x = y = z = 10;
        float d1 = 2.2f, e1 = 7.2f;

        System.out.println("");
        System.out.println("Операторы инкриментации и декриментации");
        int a = 2;
        System.out.println (a++ + " - " + a);   //постфиксный инкримент
        System.out.println (a-- + " - " + a);   //постфиксный декримент
        System.out.println (++a + " - " + a);   //префиксный инкримент
        System.out.println (--a + " - " + a);   //префиксный декримент

        System.out.println("");
        System.out.println("Деление по модулю");
        a = 0 % 4;
        System.out.println("0 % 4 = " + a);
        a = 1 % 4;
        System.out.println("1 % 4 = " + a);
        a = 2 % 4;
        System.out.println("2 % 4 = " + a);
        a = 3 % 4;
        System.out.println("3 % 4 = " + a);
        a = 4 % 4;
        System.out.println("4 % 4 = " + a);
        a = 5 % 4;
        System.out.println("5 % 4 = " + a);
        a = 6 % 4;
        System.out.println("6 % 4 = " + a);
        a = 7 % 4;
        System.out.println("7 % 4 = " + a);
        a = 8 % 4;
        System.out.println("8 % 4 = " + a);
        a = 9 % 4;
        System.out.println("9 % 4 = " + a);
        a = 10 % 4;
        System.out.println("10 % 4 = " + a);


        System.out.println("");
        System.out.println("Еще одна программа в java");
        int a1;
        int b1;
        a1 = 128;
        System.out.println("a = " + a1);
        b1 = a1 / 2;
        System.out.println("b = a / 2 = " + b1);

    }
}
