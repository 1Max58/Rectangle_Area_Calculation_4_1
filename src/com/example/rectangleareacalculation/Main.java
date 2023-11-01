package com.example.rectangleareacalculation;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program will calculate the area of the rectangle.");
        RectangleArea rectangleArea = new RectangleArea();
        if (!rectangleArea.getData()) {
            return;
        }
        rectangleArea.computeField();
        rectangleArea.fieldDisplay();
    }
}
