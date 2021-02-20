package chuev.lesson15;

public class MyConstructor {

    public void playWithFlowerClass() {
        Flower flower1 = new Flower();
        flower1.name = "Ромашка";
        flower1.color = "белая";

        Flower flower2 = new Flower("Лютик", "голубой");


        System.out.println(flower1.name + " " + flower1.color);
        System.out.println(flower2.name + " " + flower2.color);
    }

}
