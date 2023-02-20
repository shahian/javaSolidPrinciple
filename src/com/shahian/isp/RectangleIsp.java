package com.shahian.isp;

public class RectangleIsp implements IShape{
    private double width;
    private double height;

    public RectangleIsp(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
