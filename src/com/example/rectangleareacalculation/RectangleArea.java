package com.example.rectangleareacalculation;

import java.util.Scanner;

public class RectangleArea {
    private float width = 0;
    private float height = 0;
    private float area = 0;

    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter non-negative width and height of the rectangle.");
        System.out.print("Width = ");
        width = input.nextFloat();
        System.out.print("Height = ");
        height = input.nextFloat();
    }

    public void computeField() {
        area = width * height;
    }

    public void fieldDisplay() {
        System.out.printf("The area of the rectangle %.2f x %.2f is %.2f", width, height, area);
    }
}
