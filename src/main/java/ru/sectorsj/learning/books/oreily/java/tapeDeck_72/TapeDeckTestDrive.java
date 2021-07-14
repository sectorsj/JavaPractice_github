package ru.sectorsj.learning.books.oreily.java.tapeDeck_72;

public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
