package com.classes.figures;


public class Rectangle {
    private double lengthSideA;
    private double widthSideB;
    private double area;


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


    @Override
    public String toString() {
        return "Rectangle{" +
                "lengthSideA=" + lengthSideA +
                ", widthSideB=" + widthSideB +
                ", area=" + area +
                '}';
    }
}


