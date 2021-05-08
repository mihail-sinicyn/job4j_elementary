package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[count++] = right[j];
        }
        for (int k = 0; k < rsl.length; k++) {
            int min = MinDiapason.findMin(rsl, k, rsl.length - 1);
            int index = FindLoop.indexOf(rsl, min, k, rsl.length - 1);
            int temp = rsl[k];
            rsl[k] = min;
            rsl[index] = temp;
        }
        return rsl;
    }
}
