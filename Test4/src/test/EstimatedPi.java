package test;

public class EstimatedPi {
    public static void main(String[] args) {
        System.out.println("i        m(i)");

        int[] arr = {1,101,201,301,401,501,601,701,801,901};

        for (int i = 0;i < arr.length;i++) {
            System.out.printf("%-8d",arr[i]);
            System.out.printf("%6f",m(arr[i]));
            System.out.println();
        }
    }

    public  static double m(int i) {

        double elements = 1.0;
        double denominator = 1.0;
        double x = 1.0;
        int j = 2;
        while (j <= i) {
            elements = elements * (-1);
            denominator = 2 * j - 1;
            x = x + elements/denominator;
            j++;
        }
        return 4 * x;
    }
}
