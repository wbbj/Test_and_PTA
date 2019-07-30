package Test_Ahsf;

import java.util.Scanner;

public class Maopao_sort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] n=new int[N];
        for(int i=0;i<N;i++){
            n[i]=in.nextInt();
        }

        for(int i=0;i<N;i++){
            for(int j=1;j<N-i;j++){
                if(n[j]>n[j-1]){
                    int temp=n[j];
                    n[j]=n[j-1];
                    n[j-1]=temp;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(n[i]+" ");
        }
    }
}
