package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1007 {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int count=2;
        if(N<(10^5)) {
            if (N == 3) {
                System.out.print("1");
            }
            if (N >= 4) {
                for (int j = 4; j <= N; j++) {
                    if (S(j)) {
                        count++;
                    }
                }
            }
            if (count % 2 == 0) {
                int t = 0;
                t = count / 2;
                System.out.print(t);
            }
            if (count % 2 == 1) {
                int t = 0;
                t = (count - 1) / 2;
                System.out.print(t);
            }
        }
    }
    private static boolean S(int n){//判断是否为素数
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
            return false;
        }
        return true;
    }
}
