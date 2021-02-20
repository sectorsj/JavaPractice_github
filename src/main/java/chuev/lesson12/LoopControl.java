package chuev.lesson12;

import chuev.lesson11.OperatorSwitch;

public class LoopControl {
    boolean value = true;
    int a = 1, b = 10;

    OperatorSwitch operatorSwitch = new OperatorSwitch();

    public void controlLoop() {
        while (a < b) {
            System.out.println(a);
            a++;
        }
    }
}
