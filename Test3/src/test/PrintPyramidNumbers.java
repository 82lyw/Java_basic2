package test;

public class PrintPyramidNumbers {
    public static void main(String[] args) {

        for (int i = 0;i < 8;i++) {
            int x = i;
            for (int j = 0;j < 8-x;j++) {
                System.out.print("    ");
            }
            for (int j = 0;j < i;j++) {
                int y;
                if (j==0) {
                    y = 1;
                }
                else {
                    y = 2;
                    for (int a=1;a<j;a++){
                        y = 2*y;
                    }
                }
                System.out.printf("%4d",y);
            }

            for (int j = i;j >= 0;j--) {
                int y;
                if (j == 0) {
                    y = 1;
                }
                else {
                    y =2;
                    for (int a=1;a<j;a++) {
                        y = 2*y;
                    }
                }
                System.out.printf("%4d",y);
            }
            System.out.println();
        }
    }
}
