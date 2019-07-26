package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1011 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        long [][]D=new long[T][3];
        for(int i=0;i<T;i++){
            for (int j=0;j<3;j++){
                D[i][j]=in.nextLong();
            }
        }
        long A=0;
        long B=0;
        long C=0;
        if(T<=10&&T>0) {
            for (int i = 0; i < T; i++) {
                A = D[i][0];
                B = D[i][1];
                C = D[i][2];
                if(A < (2 ^ 31) && A > (2 ^ -31) &&B < (2 ^ 31) && B > (2 ^ -31)&&C < (2 ^ 31) && C > (2 ^ -31)) {
                    if (A + B > C) {
                        System.out.println("Case #" + (i + 1) + ": true");
                    } else {
                        System.out.println("Case #" + (i + 1) + ": false");
                    }
                }else {System.out.println("请输入给定区间内的整数");
                }
            }
        }

    }
}
