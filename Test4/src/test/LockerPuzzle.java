package test;

public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] box = new boolean[100];
        for(int i =0;i<100;i++){
            box[i]=false;
        }

        for(int m =1;m<=100;m++){
            for(int n =m;n<=100;n+=m){
                box[n-1]=!box[n-1];
            }
        }

        for(int i =0;i<100;i++){
            if(box[i])
                System.out.printf("%4d",i + 1);
        }
    }
}
