package Test_PTA_1001to1061;

import java.util.Arrays;
import java.util.Scanner;

public class PTA1060
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] dy=new int[N];
        for(int i=0;i<N;i++){
            dy[i]=in.nextInt();
        }
        Arrays.sort(dy);
        int t=0;
        for(int i=0;i<N;i++){
            if(dy[i]-1==N-i){
                t=N-i;
                System.out.println(t);
            }
        }
    }
}
