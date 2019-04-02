package test;

import java.util.Scanner;

public class CalculateSumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer x(0<x<1000):");
        int x = input.nextInt();

        if (x < 0 || x > 1000) {
            System.out.println("Enter a integer x(0<x<1000):");
            x = input.nextInt();
        }

        int sum = 0;

        int quotient = x;

        while (quotient > 0) {
            int remainder = quotient % 10;
            sum += remainder;
            quotient = quotient / 10;
//            System.out.println("remainder:"+remainder+"\nquotient:"+quotient);
        }

        System.out.println("the sum of '" + x + "'each number is " + sum);

    }
}
