package alishev.lesson19thiskeyword;

public class ThisKeyword {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Tom");
        human1.getInfo();
        Human human2 = new Human();
        human2.setAge(25);
        human2.setName("Bob");
        human2.getInfo();
    }
}
class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;           //вызывает human1.name = параметр setName (name)
    }
    public void setAge(int age) {
        this.age = age;             //вызывает human1.age = age параметр setAge (age)
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}