package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int number = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            int[] cell = new int[i + 1];
            for (int j = 0; j < cell.length; j++) {
                cell[j] = number;
                number++;
            }
            triangle[i] = cell;
        }
        return triangle;
    }
}