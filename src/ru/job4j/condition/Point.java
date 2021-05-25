package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(7, 14);
        Point second = new Point(3, 2);
        double dist = first.distance(second);
        System.out.println(dist);
        Point third = new Point(7, 8, 2);
        Point fourth = new Point(4, 4, 4);
        double dist3d = third.distance3d(fourth);
        System.out.println(dist3d);
    }
}