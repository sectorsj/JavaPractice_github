package ru.sectorsj.learning.videoblogers.chuev.lesson28;

public class Main {

    public static void main(String[] args) {
        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();

        Leg leg = new Leg();

        Robot<SmallHead> robot1 = new Robot<SmallHead>(body, smallHead);
        Robot<MediumHead> robot2 = new Robot<MediumHead>(body, mediumHead);
        Robot<BigHead> robot3 = new Robot<BigHead>(body, bigHead);

        robot1.getHead().burn();
        robot2.getHead().say();
        robot3.getHead().turn();

        robot1.doSomething(robot1);
        robot2.doSomething(robot2);
        robot3.doSomething(robot3);

    }
}

