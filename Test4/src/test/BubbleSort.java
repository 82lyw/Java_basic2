package test;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.print("Enter ten number:");
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];
        for (int i = 0;i < 10;i++)
            number[i] = input.nextDouble();

        BubbleSort.bubbleSort(number);
        System.out.println("After bubble sort,the array is :");
        for (int i = 0;i < 10;i++)
            System.out.printf("%8.2f",number[i]);

    }

    public static void bubbleSort (double[] arr) {
        for (int i = 0;i < arr.length -1;i++) {
            boolean flag = false;
            for (int j = 0;j < arr.length - 1 - i;j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
