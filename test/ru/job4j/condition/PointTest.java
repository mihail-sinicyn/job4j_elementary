package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;

public class PointTest {
    @Test
    public void when78And32() {
        Point first = new Point(7, 8);
        Point second = new Point(3, 2);
        double result = first.distance(second);
        double expected = 7.21;
        Assert.assertThat(expected, closeTo(result, 0.01));
    }

    @Test
    public void when351And444() {
        Point first = new Point(3, 5, 1);
        Point second = new Point(4, 4, 4);
        double result = first.distance3d(second);
        double expected = 3.31;
        Assert.assertThat(expected, closeTo(result, 0.01));
    }
}
