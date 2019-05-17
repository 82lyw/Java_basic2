package test;

import java.util.Scanner;

public class TestFour {
    private static int row, column;
    private  static four f ;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the row's size of the Two-dimensional array(it's size more than 5):");
            row = input.nextInt();
            System.out.print("Enter the column's size of the Two-dimensional array(it's size more than 5):");
            column = input.nextInt();

            if (row < 5 || column < 5)
                System.out.println("输入不合法！");
            else
                break;

        } while (true);

        f = new four(row,column);
        f.input();

        TestFour t = new TestFour();

        if (t.solve()==false)
            System.out.println("false");
        else
            System.out.println("true");

    }

    public boolean solve() {

        for (int i = 0; i < row ; i++)
            for (int j = 0; j < column ; j++) {
                int ff=BFS( i, j);
                if (ff>0) {
                    return true;
                }
            }
        return false;
    }

    public int BFS(int a,int b) {
        int i;
        for (i = 0; i <  3 && a+i+1<row; i++)
            if (f.number[a+i][b] != f.number[a+i+1][b]) {
                break;
            }
        if (i == 3) return 1;
        for (i = 0; i <  3 && b+i+1<column; i++)
            if (f.number[a][b+i] != f.number[a][b+i+1]) {
                break;
            }
        if (i == 3) return 2;
        for (i = 0; i <  3&& a+i+1<row && b+i+1<column ; i++)
            if (f.number[a+i][b+i] != f.number[a+i+1][b+i+1]) {
                break;
            }
        if (i == 3) return 3;

        for (i = 0; i <  3 &&  a+i+1< row &&b-i-1>=0; i++)
            if (f.number[a+i][b-i] != f.number[a+i+1][b-i-1]) {
                break;
            }
        if (i == 3) return 4;

        return 0;
    }
}

class four {
    private int row, column;
    int[][] number;

    four () {};

    four (int n,int m) {
        row = n;
        column = m;
        number = new int[row][column];
    }

    public void input() {
        System.out.println("Enter the Two-dimensional array:");
        Scanner put = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                number[i][j] = put.nextInt();
            }
        }
    }

}
