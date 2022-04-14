package com.sek;

public class Square extends Rectangle{
    private double side;

    public Square(String color, boolean filled, double width, double height,double side){
        super(color, filled, width, height);
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }
}
