package ru.sectorsj.learning.books.oreily.java.movie_67;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как проиграть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Боевик";
        three.rating = 127;
    }
}
