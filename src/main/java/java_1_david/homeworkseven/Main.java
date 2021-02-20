package java_1_david.homeworkseven;

public class Main {
    public static void main(String[] args) {
        HungryCat cat = new  HungryCat ("Barsik", 5);
        Plate plate = new Plate(100);
        plate.Info();
        cat.eat(plate);
        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.Info();
    }

}
