package com.hw5;

public class Triangle implements Shape{
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area(){
        double p = (this.side1 + this.side2 + this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }
}