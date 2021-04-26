package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        return (Math.pow(p, 2) * k) / Math.pow(((2 * k) + 2), 2);
    }

    public static void main(String[] args) {
        System.out.println(" p = 6, k = 2, s = " + SqArea.square(6, 2));
    }
}