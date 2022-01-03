package com.annakhuda.automation.module5.task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Oval oval = new Oval(4.3, 11.87);
        Square square = new Square(8.945);
        Rectangle rectangle = new Rectangle(4, 6.23);
        System.out.println("The area of circle is: " + circle.getSquare());
        System.out.println("The area of oval is: " + oval.getSquare());
        System.out.println("The area of square is: " + square.getSquare());
        System.out.println("The area of rectangle is: " + rectangle.getSquare());
    }
}
