package test;

public class EightQueens {
    final int N = 8;
    int[] queenArray = new int[N];
    static int m = 0;

    public void NQueens (int k) {
        int i;
        if (k == N) {
            m++;
            for (i = 0;i < 8;i++) {
                printQueens();
                return;
            }
        }

        for(i = 0;i < N;i++) {
            if (m >= 1) {
                break;
            }
            int j;
            for (j = 0;j < k;j++) {
                if (queenArray[j] == i || Math.abs(queenArray[j] - i) == Math.abs(k - j)) {
                    break;
                }
            }
            if (j == k) {
                queenArray[k] = i;
                NQueens(k + 1);
            }
        }

    }

    public void printQueens (){
        for (int i = 0;i < 8;i++) {
            for (int j = 0;j < 8;j++) {
                if (queenArray[i] == j) {
                    System.out.print("|Q");
                }
                else {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        EightQueens q = new EightQueens();
        q.NQueens(0);
    }
}


