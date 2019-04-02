package test;

import java.util.Scanner;

public class ComputeTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x:");
        double x = input.nextDouble();

        double result = Math.sin(x) + Math.cos(x) + Math.atan(x);

        System.out.println("sinX+cosX+tan-1X = " + result);

    }
}
