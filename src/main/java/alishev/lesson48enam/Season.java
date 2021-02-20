package alishev.lesson48enam;

public enum Season {
    SPRING(15),
    SUMMER(35),
    AUTUMN(10),
    WINTER(-25);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
