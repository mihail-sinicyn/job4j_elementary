package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondSumStartingFromSecondTest {

    @Test
    public void test() {
        assertEquals(2, SecondSumStartingFromSecond.sum(1, 2));
        assertEquals(3, SecondSumStartingFromSecond.sum(2, 4));
        assertEquals(6, SecondSumStartingFromSecond.sum(1, 4));
        assertEquals(6, SecondSumStartingFromSecond.sum(1, 5));
        assertEquals(9, SecondSumStartingFromSecond.sum(0, 6));
    }

}