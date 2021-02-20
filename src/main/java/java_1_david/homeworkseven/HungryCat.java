package java_1_david.homeworkseven;

public class HungryCat {
    private String name;
    private int appetite;

    public HungryCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate p) {
        p.decreaseFood(appetite);
    }

    public void satiety () {

    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

}
