package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1006{
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=0;//声明存储十分位的变量
        int b=0;//声明存储百分位的变量
        int g=0;//声明存储个位的变量
        if(n<10&&n>0){//1位数
            for(int i=1;i<=n;i++){
                System.out.print(i);
            }
        }
        if(n>=10&&n<100){//2位数
            s=n/10;
            g=n%10;
            for(int i=1;i<=s;i++){
                System.out.print("S");
            }
            for(int i=1;i<=g;i++){
                System.out.print(i);
            }
        }
        if(n>=100&&n<1000){//3位数
            b=n/100;
            s=(n%100)/10;
            g=(n%100)%10;
            for(int i=1;i<=b;i++){
                System.out.print("B");
            }
            for(int i=1;i<=s;i++){
                System.out.print("S");
            }
            for(int i=1;i<=g;i++){
                System.out.print(i);
            }
        }else {
            System.out.print("请输入1000以内的正整数");
        }
    }
}