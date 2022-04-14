package com.sek;

public class Main {

    public static void main(String[] args) {

        Movable m1 = new MovablePoint(5,6,10,1);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovablePoint(2,1,2,20);
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);

        Circle c1 = new Circle(2);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Resizable c2 = new ResizableCircle(3,14) {
            @Override
            public void resize(int percent) {
                super.resize(percent);
            }

        };
        System.out.println(c2);
        c2.resize(14);
        System.out.println(c2);
        }
    }

