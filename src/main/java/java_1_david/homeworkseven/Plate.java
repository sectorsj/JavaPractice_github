package java_1_david.homeworkseven;

public class Plate {

    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public void decreaseFood (int n) {
        food -= n;
    }

    public void Info () {
        System.out.println("В тарелке: " + food);
    }

    public int getFood () {
        return food;
    }

    public void setFood (int food) {
        this.food = food;
    }



}
