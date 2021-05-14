package ru.job4j.loop;

public class SecondSumStartingFromSecond {
    public static int sum(int a, int b) {
        int sumAB = 0;
        /**
         *  Вычисляем сумму каждого второго числа в промежутке начиная со второго.
         */
        for (int i = a + 1; i <= b; i++) {
            sumAB = sumAB + i;
            i++;
        }
        return sumAB;
    }
}

