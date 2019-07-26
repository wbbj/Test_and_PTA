package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1027 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        char c=in.next().charAt(0);
        in.close();
        int m=1;
        int t=1;
        //沙漏能存放的符号数
        while (m<=N) {
            m += 2 * (2 * t + 1);
            t++;
        }
        int dy=N-(m-2*(2*(t-1)+1));//剩余符号
        int k=2*(t-2)+1;
        int l=t-2;
        int d=4;
        for(int i=1;i<=l+1;i++){//沙漏上面一半符号
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int x=k;x>0;x--){
                System.out.print(c);

            }
            k=k-2;
            System.out.println();
        }
        int s=l;
        for(int i=1;i<=l;i++){//沙漏下面一半少一行只有一个符号的符号
            for (int j=s;j>1;j--){
                System.out.print(" ");
            }s=s-1;
            for (int x=1;x<d;x++){
                System.out.print(c);
            }
            d=d+2;

            System.out.println();
        }
        System.out.println(dy);
    }
}
