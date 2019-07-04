package test;

import java.util.Scanner;

public class Triangle extends GeometricObject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        input.nextLine();
        System.out.print("Enter the color: ");
        String color = input.nextLine();
        triangle.setColor(color);

        System.out.print("Enter a boolean value for filled: ");
        boolean filled = input.nextBoolean();
        triangle.setFilled(filled);

        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("The boolean value for filled is " + triangle.isFilled());
        System.out.println(triangle);
    }

    double side1,side2,side3;

    Triangle() {
        side1 = side2 = side3 = 1;
    }

    Triangle(double side1,double side2,double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
