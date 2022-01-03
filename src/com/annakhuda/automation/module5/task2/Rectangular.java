package com.annakhuda.automation.module5.task2;

public abstract class Rectangular implements Shape {
    protected double height;
    protected double width;

    @Override
    public double getSquare() {
        return height * width;
    }
}
