package com.sek;

public abstract class ResizableCircle extends Circle implements Resizable{
    public int percent;
    public ResizableCircle(double radius, int percent){
        super(radius);
        this.percent = percent;
    }

    @Override
    public void resize(int percent) {
        this.radius = this.radius + ((this.radius*percent)/100);
    }

    @Override
    public String toString() {
        return "ResizableCircle: radius = " +
                radius+
                " ,resizablePercent = " + percent;
    }
}
