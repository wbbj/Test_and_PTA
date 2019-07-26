package Test_PTA_1062to;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PTA1066 {
    public static void main(String[] replacegs) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int M=sc.nextInt();
        int N=sc.nextInt();
        int e=sc.nextInt();
        int[][] replace = new int[A][B];
        for(int i=0;i<A;i++) {
            for(int j=0;j<B;j++) {
                replace[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<A;i++) {
            for(int j=0;j<B-1;j++) {
                if(replace[i][j]>=M&&replace[i][j]<=N) {
                    String str =  new DecimalFormat("000").format(e);
                    System.out.print(str+" ");
                }
                else {
                    String str =  new DecimalFormat("000").format(replace[i][j]);
                    System.out.print(str+" ");
                }
            }
            if(replace[i][B-1]>=M&&replace[i][B-1]<=N) {
                String str =  new DecimalFormat("000").format(e);
                System.out.println(str);
            }else {
                String str =  new DecimalFormat("000").format(replace[i][B-1]);
                System.out.println(str);
            }

        }
    }
}