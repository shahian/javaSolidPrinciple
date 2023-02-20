package com.shahian.lsp;

public class SquareLsp extends ShapeLsp {
    private int side;

    public SquareLsp(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}
