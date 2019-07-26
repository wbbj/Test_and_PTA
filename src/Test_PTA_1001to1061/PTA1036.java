package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1036 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        char C=in.next().charAt(0);
        if(N>=3&&N<=20){
            for(int i=1;i<=Math.round(N/2);i++){
                for (int j=1;j<=N;j++){
                    if(i>=2&&(i<=(Math.round(N/2)-1))&&j>=2&&j<=(N-1)){
                        System.out.print(" ");
                    }else {
                        System.out.print(C);
                    }
                }
                System.out.println();
            }
        }
    }
}
