package com.annakhuda.automation.module5.task1;

import java.util.Random;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double dotProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public double dotProduct() {
        Vector[] vectors = createArrayWithRandomVectors(1);
        Vector vector = vectors[0];
        System.out.println("Random " + vector.toString());
        return dotProduct(vector);
    }

    public static Vector[] createArrayWithRandomVectors(int arraySize) {
        Random random = new Random();
        Vector[] vectors = new Vector[arraySize];
        for (int i = 0; i < arraySize; i++) {
            vectors[i] = new Vector(random.nextDouble() * 100 - 50, random.nextDouble() * 100 - 50,
                    random.nextDouble() * 100 - 50);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector: x = " + x + " , y = " + y + " , z = " + z;
    }
}
