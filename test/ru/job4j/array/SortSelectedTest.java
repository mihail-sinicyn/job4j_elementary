package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void when344125Sort12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when171984Sort148917() {
        int[] data = new int[] {17, 1, 9, 8, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 8, 9, 17};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when543Sort345() {
        int[] data = new int[] {5, 4, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}