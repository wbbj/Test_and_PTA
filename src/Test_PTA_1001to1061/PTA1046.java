package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1046 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[][]m=new int[N][4];
        for (int i=0;i<N;i++){
            for (int j=0;j<4;j++){
                m[i][j]=in.nextInt();
            }
        }
        int countJ=0,countY=0;
        for (int i=0;i<N;i++){
            if((m[i][0]+m[i][2]==m[i][1])&&(m[i][1]!=m[i][3])){
                countY++;
            }
            if((m[i][0]+m[i][2]==m[i][3])&&(m[i][1]!=m[i][3])){
                countJ++;
            }
        }
        System.out.println(countJ+" "+countY);
    }
}
