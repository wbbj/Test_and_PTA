package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1041 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        long[][] s=new long[N][3];
        for(int i=0;i<N;i++){
            s[i][0]=in.nextLong();
            s[i][1]=in.nextInt();
            s[i][2]=in.nextInt();
        }
        int M=in.nextInt();
        int[] n=new int[M];
        for(int i=0;i<M;i++){
            n[i]=in.nextInt();
        }
        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                if (s[i][2] == n[j]){
                    System.out.println(s[i][0]+" "+s[i][1]);
                }
            }
        }

    }
}
