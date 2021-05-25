package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void when78And32() {
        Point first = new Point(7, 8);
        Point second = new Point(3, 2);
        double result = first.distance(second);
        assertThat(result, is(7.211102550927978));
    }

    @Test
    public void when351And444() {
        Point first = new Point(3, 5, 1);
        Point second = new Point(4, 4, 4);
        double result = first.distance3d(second);
        assertThat(result, is(3.3166247903554));
    }
}
