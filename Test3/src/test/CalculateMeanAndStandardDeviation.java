package test;

import java.util.Scanner;

public class CalculateMeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        double[] number = new double[10];
        double sum = 0;
        double average = 0;
        double sumOfSquare = 0;
        double squareOfSum = 0;
        double standardDeviation = 0;
        for (int i = 0;i< 10;i++) {
            number[i] = input.nextDouble();
            sum += number[i];
            sumOfSquare += Math.pow(number[i],2);
        }
        squareOfSum = Math.pow(sum,2);
        average = sum / 10;
        standardDeviation = Math.sqrt((sumOfSquare - squareOfSum /10) / 9);
        System.out.println("The mean is " + average);
        System.out.println("The standard deviation is " + standardDeviation);
    }
}
