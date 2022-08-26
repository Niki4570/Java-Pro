package com.hw5;

public class Square implements Shape{
    double side1;

    public Square(double side1) {
        this.side1 = side1;
    }

    public double area(){
        return Math.pow(side1, 2);
    }
}
