package ru.sectorsj.learning.videoblogers.alishev.lesson30castingprimitives;

public class CastingPrimitives {
    public static void main(String[] args) {
            // типы примитивов      // int short byte long double float
        // float f = (float)123.4;  // явное привидение к double
        //
        // int a = 96234;
        // long l = a;              // неявное
        // int x = (int)l;          // явное
        // System.out.println(x);

        int a1 = 123;
        double d1 = a1;               // неявное привидение к типу double

        double d2 = 123.5;
        int a2 = (int)d2;             // явное приведение к типу int

        long l1 = Math.round(d2);     // округление вещественного числа (123.5) до 124

        byte b1 = (byte)128;          //-128 - 127
                                        // превысили числовой ряд и идем в обратную сторону!

        System.out.println(d1);
        System.out.println(a2);
        System.out.println(l1);
        System.out.println(b1);

    }
}
