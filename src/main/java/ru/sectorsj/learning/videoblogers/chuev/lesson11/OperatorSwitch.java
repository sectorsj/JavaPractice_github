package ru.sectorsj.learning.videoblogers.chuev.lesson11;

public class OperatorSwitch {

    final int VALUE = 2, FIRST_VALUE = 1, SECOND_VALUE = 2, THIRD_VALUE = 3;

    public void testSwitchOperator() {

        switch (VALUE) {
            case FIRST_VALUE:
                System.out.println(FIRST_VALUE);
            case SECOND_VALUE:
                System.out.println(SECOND_VALUE);
            case THIRD_VALUE:
                System.out.println(THIRD_VALUE);
            default:
                System.out.println("Default");
        }
    }
}
