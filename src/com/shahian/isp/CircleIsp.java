package com.shahian.isp;

public class CircleIsp implements IShape{
    private double radius;

    public CircleIsp(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
