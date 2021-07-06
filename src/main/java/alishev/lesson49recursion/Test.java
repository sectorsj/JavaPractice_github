package alishev.lesson49recursion;

public class Test {
    public static void main(String[] args) {
        // counter(3);
        System.out.println(fact(4));
    }

    // counter (3) -> counter (2) -> counter (1)

    // 4! = 4*3*2*1
    // 1! = 1
    // 15! = 15*14*13*12*11*10*9*8*7*6*5*4*3*2*1
    // 0! = 1

    private static void counter(int n) {
        if (n == 0)
            return;
        System.out.println(n);

        counter(n - 1); // 3, 2, 1 - counter занимают очередь на исполнение
        // 1, 2, 3 - counter по очереди выходят из программы
    }


    // fact(4)
    //4 * fact(3)
    //3 * fact(2)
    //2 * fact(1)
    //fact(1) = return 1;

    private static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
