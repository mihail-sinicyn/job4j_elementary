package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDiv(double first, double second) {
        return div(first, second)
                + minus(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sumAndMultiply(first, second)
                + minusAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма сложения и умножения = " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления = " + minusAndDiv(12, 10));
        System.out.println("Сумма всех математических операций = " + sumAllOperations(9, 3));
    }
}
