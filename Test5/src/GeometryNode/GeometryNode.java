package GeometryNode;

import java.util.Scanner;

public class GeometryNode {
    static double[] x = new double[4];
    static double[] y = new double[4];
    static double a,b,c,d,e,f;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0;i < 4;i++) {
            System.out.println("Please enter point" + (i + 1));
            System.out.print("x" + (i + 1) + ":");
            x[i] = input.nextDouble();
            System.out.print("y" + (i + 1) + ":");
            y[i] = input.nextDouble();
        }
        a = y[0] - y[1];
        b = - (x[0] - x[1]);
        e = a * x[0] + b * y[0];
        c = y[2] - y[3];
        d = - (x[2] - x[3]);
        f = c * x[2] + d * y[2];

        LinearEquation node = new LinearEquation(a,b,c,d,e,f);

        if (!node.isSolvable()) {
            System.out.println("The two lines are parallel");
        }
        else {
            double x,y;
            x = node.getX();
            y = node.getY();
            System.out.println("The  intersecting point is at (" + x + "," + y + ")");
        }
    }
}
