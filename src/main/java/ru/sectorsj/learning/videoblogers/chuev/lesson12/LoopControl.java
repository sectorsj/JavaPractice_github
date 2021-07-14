package ru.sectorsj.learning.videoblogers.chuev.lesson12;

import ru.sectorsj.learning.videoblogers.chuev.lesson11.OperatorSwitch;

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
