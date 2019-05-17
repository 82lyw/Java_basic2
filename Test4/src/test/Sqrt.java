package test;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.print("Its sqrt is ");
        System.out.printf("%.3f",sqrt(n));
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = 1;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        } while(Math.abs(nextGuess-lastGuess) >= 0.0001);

        return nextGuess;
    }
}
