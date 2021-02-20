package alishev.lesson48enam;

public enum Animal {
    DOG("собака"),
    CAT("кошка"),
    FROG("лягушка");

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }
    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "перевод на Русский язык " + translation;
    }
}
