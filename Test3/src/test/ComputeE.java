package test;

import java.util.Scanner;

public class ComputeE {
    public static void main(String[] args) {
        double e = 1;
        double x = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter i:");
        double i = input.nextDouble();

        for (int j = 1;j <= i;j++) {
            x = x*j;
            double y = 1.0/x;
            e = e + y;
        }

        System.out.println("µ± = " + i + "Ê±£¬e = " + e);
    }
}
