package test;

import java.util.Scanner;

//分段函数
public class PiecewiseFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x:");
        double x = input.nextDouble();
        System.out.println("Enter y:");
        double y = input.nextDouble();

        double result;

        if (x < 0 && y < 0) {
            result = Math.exp(x + y);
        }
        else if (x + y < 10 && x + y >= 1) {
            result = Math.log(x + y);
        }
        else {
            result = Math.log10(Math.abs(x + y) + 1);
        }
        System.out.println("the result is " + result);
    }
}
