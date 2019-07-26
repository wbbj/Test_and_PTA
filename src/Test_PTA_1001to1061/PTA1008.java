package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1008 {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int []X=new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = in.nextInt();//输入N个数字到数组中
        }
        if(N==1){
            System.out.print(X[0]);
        }
        if(N>1&&N<=100&&M>=0&&N>M) {
            for(int i=N-M;i<N;i++){//从第N-M+1个数开始遍历
                System.out.print(X[i]+" ");
            }
            for(int i=0;i<N-M;i++){
                System.out.print(X[i]+" ");
            }
        }
        if(N>1&&N<=100&&M>=0&&N<M){
            M=M-N;
            while (M>N){
                M=M-N;
            }
            for(int i=N-M;i<N;i++){
                System.out.print(X[i]+" ");
            }
            for(int i=0;i<N-M;i++){
                System.out.print(X[i]+" ");
            }
        }
    }
}
