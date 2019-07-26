package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1012 {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] T=new int[N];
        for (int i=0;i<N;i++){
            T[i]=in.nextInt();
        }
        int A1=0,A2=0,A3=0,A5=0;
        double A4=0;
        int count=0;
        int n=1;
            for (int j=0;j<N;j++){
                if(T[j]%5==0&&T[j]%2==0){
                    A1+=T[j];
                }
                if(T[j]%5==1){
                    A2+=(n*T[j]);
                    n=-n;
                }
                if(T[j]%5==2){
                    A3++;
                }
                if(T[j]%5==3){
                    A4+=T[j];
                    count++;
                }
                if(T[j]%5==4){
                    A5=Math.max(A5,T[j]);
                }
            }
        if(A1==0){
            System.out.print("N");
        }else {
            System.out.print(A1);
        }
        if(A2==0){
            System.out.print(" "+"N");
        }else {
            System.out.print(" "+A2);
        }
        if(A3==0){
            System.out.print(" "+"N");
        }else {
            System.out.print(" "+A3);
        }
        if(A4==0){
            System.out.print(" "+"N");
        }else {
            System.out.printf(" "+"%.1f ",A4/count);
        }
        if(A5==0){
            System.out.print(" "+"N");
        }else {
            System.out.print(" "+A5);
        }
    }
}
