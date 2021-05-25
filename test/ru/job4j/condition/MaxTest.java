package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class MaxTest {
    @Test
    public void whenMax7() {
        int result = Max.max(3, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax19() {
        int result = Max.max(10, 4, 19);
        assertThat(result, is(19));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}