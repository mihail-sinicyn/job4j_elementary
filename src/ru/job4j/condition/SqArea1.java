package ru.job4j.condition;

public class SqArea1 {
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;

    }

    public static void main(String[] args) {
        System.out.println(" p = 6, k = 2, s = " + SqArea1.square(6, 2));
    }
}
