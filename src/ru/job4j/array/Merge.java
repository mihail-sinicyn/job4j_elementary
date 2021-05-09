package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, n = 0;
        while (i < left.length && j < right.length) {
            rsl[n++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            rsl[n++] = left[i++];
        }
        while (j < right.length) {
            rsl[n++] = right[j++];
        }
        return rsl;
    }
}