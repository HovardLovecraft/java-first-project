package com.classes;

/**
 * Rectangle with it's methods and constructor
 */

public class Rectangle {
    private double lengthSideA;
    private double widthSideB;
    private double area;

    /**
     *
     * @param lengthSideA
     * @param widthSideB
     */

    public Rectangle(double lengthSideA, double widthSideB) {
        this.lengthSideA = lengthSideA;
        this.widthSideB = widthSideB;
        this.area = lengthSideA * widthSideB;
    }

    public double getLengthSideA() {
        return lengthSideA;
    }

    public void setLengthSideA(double lengthSideA) {
        this.lengthSideA = lengthSideA;
    }

    public double getWidthSideB() {
        return widthSideB;
    }

    public void setWidthSideB(double widthSideB) {
        this.widthSideB = widthSideB;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = getWidthSideB() * getLengthSideA();
    }

    /**
     *
     * @return
     */

    @Override
    public String toString() {
        return "Rectangle{" +
                "lengthSideA=" + lengthSideA +
                ", widthSideB=" + widthSideB +
                ", area=" + area +
                '}';
    }
}


