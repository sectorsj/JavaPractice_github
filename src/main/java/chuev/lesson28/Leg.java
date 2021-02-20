package chuev.lesson28;

public class Leg {

    public <T1, T2 extends Leg> T2 moveLeg(T1 a, T2 b) {

        return b;
    }
}
