package test;

import java.util.Scanner;

public class ComputeLog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x:");
        double x = input.nextDouble();

        double result = Math.log10(1 + Math.sqrt(1 + Math.pow(x, 2)));

        System.out.println("Math.log10(1 + Math.sqrt(1 + Math.pow(x, 2))) = " + result);
    }
}