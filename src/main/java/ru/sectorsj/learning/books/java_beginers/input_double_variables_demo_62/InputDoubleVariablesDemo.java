package ru.sectorsj.learning.books.java_beginers.input_double_variables_demo_62;

import javax.swing.*;

public class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        double mass, height, bmi;
        String result;

        result = JOptionPane.showInputDialog("Ваш рост в метрах: ");

        height = Double.parseDouble(result);

        result = JOptionPane.showInputDialog("Ваш вес килограммах: ");

        mass = Double.parseDouble(result);

        bmi = mass/height/height;

        bmi = Math.round(bmi * 100)/100.0;

        JOptionPane.showMessageDialog(null, "Индекс массы тела: " + bmi);
    }
}
