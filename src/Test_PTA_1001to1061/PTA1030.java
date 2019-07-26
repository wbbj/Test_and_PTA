package Test_PTA_1001to1061;

import java.util.Arrays;
import java.util.Scanner;

public class PTA1030 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int P=in.nextInt();
        long[] a=new long[N];
        for(int i=0;i<N;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a, 0, N);
        int count=0;
        for(int i=0;i<N;i++) {
            for(int j=i+count;j<N;j++) {
                if(a[j]<=a[i]*N) {
                    count++;
                }
                else break;
            }
        }
        System.out.println(count);
    }
}
