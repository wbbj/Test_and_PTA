package Test_Ahsf;

import java.util.Scanner;

public class Tong_sort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] n=new int[10];
        for(int i=0;i<N;i++){
            n[i]=0;
        }
        for(int i=0;i<N;i++){
            int m=in.nextInt();
            for(int j=0;j<10;j++){
                if(j==m){
                    n[j]++;

                }
            }
        }
        for(int i=0;i<10;i++){
            if(n[i]!=0){
                for(int j=0;j<n[i];j++){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
