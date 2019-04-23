package test;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer:");
        int n1 = input.nextInt();
        System.out.print("Enter second integer:");
        int n2 = input.nextInt();

        int little = n1 < n2 ? n1 : n2;

        int i;
        for (i = n2;i > 1;i--) {
            if (n1 % i == 0 && n2 % i == 0)
                break;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + i);
    }
}
