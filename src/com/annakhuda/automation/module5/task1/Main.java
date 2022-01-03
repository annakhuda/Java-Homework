package com.annakhuda.automation.module5.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3.4, 5.6, 18.1);
        System.out.println(vector.toString());
        System.out.println("The vector length is: " + vector.length());
        System.out.println("The dot product of vectors is: " + vector.dotProduct(new Vector(76.1, 3.2, 8.56)));
        System.out.println("The dot product of vectors (one of vectors is random) is: " +
                vector.dotProduct());
        System.out.println("The array of random vectors: " + Arrays.toString(Vector.createArrayWithRandomVectors(10)));
    }
}
