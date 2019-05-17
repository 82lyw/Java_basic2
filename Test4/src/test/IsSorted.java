package test;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        System.out.print("Enter the size of the list:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the contents of the list:");
        for (int i = 0;i < n;i++)
            arr[i] = input.nextInt();

        boolean flag = isSorted(arr);
        String str = flag ? "not sorted" : "already sorted";

        System.out.print("The list has " + arr.length + " integers :");
        for (int i = 0;i < arr.length;i++)
            System.out.printf("%5d",arr[i]);

        System.out.print("\nThe list is " + str);

    }

    public static boolean isSorted(int[] list) {
        boolean flag = false;
        for (int i = 0;i < list.length -1;i++) {
            for (int j = 0;j < list.length - 1 - i;j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return flag;
    }
}
