package alishev.lesson42equalsandstringpool;

public class Test {
    public static void main(String[] args) {
        // int x=1;
        // int y=1;
        // System.out.println(x == y);

        Animal animal1 = new Animal(1);             //1
        Animal animal2 = new Animal(1);             //2
        Animal animal3 = animal1;                       //3

        System.out.println(animal1==animal2);                       //1

        System.out.println(animal3==animal1);                       //2

        System.out.println(animal1.equals(animal2));                //3


        System.out.println("\n"+ "Сравнение строк (String Pool):");
        stringComparison();

    }

    public static void stringComparison() {
        String string1 = "Hello";
        String string2 = "Hello";

        String string3 = new String("Hello");
        String string4 = new String("Hello");

        String string5 = "Hello";
        String string6 = "Hello123".substring(0,5);


        System.out.println(string1.equals(string2));
        System.out.println(string1 == string2);

        System.out.println(string3.equals(string4));
        System.out.println(string3 == string4);

        System.out.print(string6 + " - ");
        System.out.println(string5 == string6);
    }
}



class Animal {
    private int id;

    //1
    public Animal(int id) {
        this.id = id;
    }

    //2
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
