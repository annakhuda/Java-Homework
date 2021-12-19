package com.annakhuda.automation.module5.task2;

public abstract class Round implements Shape {
    protected double radius;

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
