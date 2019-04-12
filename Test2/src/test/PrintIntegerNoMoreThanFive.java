package test;

import java.util.Scanner;

public class PrintIntegerNoMoreThanFive {
    public static void main(String[] args) {
        System.out.println("Enter a integer x(0<x<100000):");

        while (true) {
            Scanner input = new Scanner(System.in);
            try{
                int x=input.nextInt();

                while (x < 0 || x >= 100000) {
                    System.out.println("Please enter a integer x(0<x<100000):");
                    x = input.nextInt();
                }

                String invert = "";
                int quotient = x;
                int n = 0;

                while (quotient > 0) {
                    int remainder = quotient % 10;
                    invert = invert + remainder;
                    quotient = quotient / 10;
                    n++;
                }
                System.out.println("The inverted number is " + invert
                        + " and the number of digits is " + n);

            }catch(Exception e){
                System.out.println("Enter a integer x(0<x<100000):");
                continue;
            }
            break;
        }
        

    }
}
