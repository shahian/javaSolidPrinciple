package com.shahian.lsp;

public class RectangleLsp extends ShapeLsp {
    private int length;
    private int width;

    public RectangleLsp(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }
}
