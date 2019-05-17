package test;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.print("Enter a integer:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(isPalinrome(number)) {
            System.out.println(number + " is Palinrome number");
        }
        else {
            System.out.println(number + " isn't Palinrome number");
        }

    }

    public static int reverse(int number) {
        int quotient = number;
        int remainder = 0;
        int reverseNumber = 0;
        while (quotient > 0) {
            remainder = quotient % 10;
            quotient = quotient / 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        return reverseNumber;
    }

    public static boolean isPalinrome(int number) {
        int reverseNumber = reverse(number);
        return reverseNumber == number;
    }
}
