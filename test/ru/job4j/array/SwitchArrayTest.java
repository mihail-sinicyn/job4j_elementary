package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {7, 8, 3, 5};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 3, 8, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5to2() {
        int[] input = {0, 17, 2, 2, 19, 3};
        int source = 5;
        int dest = input.length - 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 17, 3, 2, 19, 2};
        Assert.assertArrayEquals(expected, result);
    }
}