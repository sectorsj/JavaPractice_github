package alishev.lesson41abstractclass;

public class Dog implements AbleToMakeSound {
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
