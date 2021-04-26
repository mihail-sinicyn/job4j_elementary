package ru.job4j.loop;

public class SecondSum { // Вычисляем сумму каждого второго числа в промежутке начиная с первого
    public static int sum(int a, int b) {
        int sumAB = 0;
        for (int i = a; i <= b; i++) {
            sumAB = sumAB + i;
            i++;
        }
        return sumAB;
    }
}
