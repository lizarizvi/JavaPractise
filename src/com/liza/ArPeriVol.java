package com.liza;

import java.util.Scanner;

public class ArPeriVol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the radius: ");
        double radius = in.nextDouble();

        System.out.println("area of circle: " + (2 * 3.14 * radius * radius));

        System.out.println("perimeter of circle: " + (2 * 3.14 * radius));

        System.out.print("enter the base: ");
        double base = in.nextDouble();
        System.out.print("enter the height: ");
        double height = in.nextDouble();

        System.out.println("Curved Surface Area Of Cylinder: " + (2 * 3.14 * radius * height));

        System.out.println("area of triangle or isosceles triangle: " + (0.5 * base * height));

        System.out.println("area of parallelogram and rhombus: " + (base * height));

        System.out.println("area of equilateral triangle: " + (Math.sqrt(3) / 4 * base * base));

        System.out.println("perimeter of any triangle: " + (3 * base));

        System.out.println("perimeter of parallelogram: " + (2 * (base + height)));

        System.out.print("enter the length: ");
        double length = in.nextDouble();
        System.out.print("enter the breadth: ");
        double breadth = in.nextDouble();

        System.out.println("Total Surface Area Of Cube: " + (6 * length * length));

        System.out.println("area of rectangle: " + (length * breadth));

        System.out.println("perimeter of rectangle: " + (2 * (length + breadth)));

        System.out.println("perimeter of square or rhombus: " + (4 * length));

        System.out.println("volume of cone: " + (3.14 * radius * radius * height / 3));

        System.out.println("volume of cylinder: " + (3.14 * radius * radius * height));

        System.out.println("volume of sphere: " + (3.14 * radius * radius * radius * 4 / 3));

        System.out.print("enter the base area: ");
        double baseArea = in.nextDouble();

        System.out.println("volume of prism: " + (baseArea * height));

        System.out.println("volume of pyramid: " + (baseArea * height / 3));
    }
}
