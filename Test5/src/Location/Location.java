package Location;

import java.util.Scanner;

public class Location {
    int row,column;
    double maxValue;

    public static void main(String[] args) {
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array:");
        m = input.nextInt();
        n = input.nextInt();
        System.out.println("Enter the array:");
        double[][] array = new double[m][n];
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location Max = locateLargest(array);
        System.out.print("The location of the largest element is "
                + Max.maxValue + " at (" + Max.row + "," + Max.column + ")");

    }

    Location() {
        row = 0;
        column = 0;
        maxValue = 0;
    }

    public static Location locateLargest(double[][] a) {
        Location L = new Location();
        for (int i = 0;i < a.length;i++) {
            for (int j = 0;j < a[i].length;j++) {
                if (L.maxValue < a[i][j]) {
                    L.row = i;
                    L.column = j;
                    L.maxValue = a[i][j];
                }
            }
        }
        return L;
    }


}
