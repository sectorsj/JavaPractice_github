package alishev.lesson23stringbuilder;


public class LearnStringBuilder {
    //public StringBuilder23(String text) {
//
    //}

    public static void main(String[] args) {

            //Пример1
            // не изменяемость данных типа String

        // String x = "Hello";
        // //x.toUpperCase();      // слово не станет из заглавных букв - Hello
        // x = x.toUpperCase();    // слово станет из заглавных букв - HELLO
        // System.out.println(x);

            // Пример 2
            // не эффективное использование данных типа String

        // String string1 = "Hello";
        // String string2 = " my";
        // String string3 = " friend";
        // String stringAll = string1 + string2 + string3;
        // System.out.println(stringAll);

            // Пример 3
            // если работаем со строками

        StringBuilder sb = new StringBuilder ("Hello");
        StringBuilder sb1 = new StringBuilder ("Kill");
        System.out.println(sb.toString());

        sb.append(" my");
        sb.append(" friend");

        sb1.append(" all").append(" humans"); // метод Chaining

        System.out.println(sb.toString());
        System.out.println(sb1.toString());
    }
}