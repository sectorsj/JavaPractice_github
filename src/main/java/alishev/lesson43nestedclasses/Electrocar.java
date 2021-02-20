package alishev.lesson43nestedclasses;

public class Electrocar {
    private int id;

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Electrocar" + id + "is starting up");
    }
}
