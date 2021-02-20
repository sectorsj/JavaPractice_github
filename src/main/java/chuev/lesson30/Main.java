package chuev.lesson30;

public class Main {
    public static void main(String[] args) {
        PerimeterSquare perimeterSquare = new PerimeterSquare();
        try {
            perimeterSquare.getPerimeter("g");
        } catch (PerimeterException e) {
            e.printStackTrace();
        }
    }
}
