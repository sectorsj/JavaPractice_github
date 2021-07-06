package java_beginers.input_int_variables_demo_60;

import javax.swing.*;

public class InputIntVariablesDemo {
    public static void main(String[] args) {
        int age, year, birth;
        String result;

        result = JOptionPane.showInputDialog("Какой сейчас год?");
        year = Integer.parseInt(result);

        result = JOptionPane.showInputDialog("Сколько Вам лет?");
        age = Integer.parseInt(result);

        birth = year-age;

        JOptionPane.showMessageDialog(null,"Вы родились в " + birth + "году!");
    }
}
