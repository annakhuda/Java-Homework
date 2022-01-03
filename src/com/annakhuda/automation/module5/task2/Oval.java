package com.annakhuda.automation.module5.task2;

public class Oval extends Round {
    private double majorRadius;
    private double minorRadius;

    public Oval(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getSquare() {
        return Math.PI * majorRadius * minorRadius;
    }
}
