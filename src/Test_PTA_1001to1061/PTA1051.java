package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1051
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double R1=in.nextDouble();
        double P1=in.nextDouble();
        double R2=in.nextDouble();
        double P2=in.nextDouble();
        double a=R1*Math.cos(P1);
        double b=R1*Math.sin(P1);
        double c=R2*Math.cos(P2);
        double d=R2*Math.sin(P2);
        double A=a*c-b*d;
        double B=a*d+c*b;

        if(Math.abs(A)<0.01) {
            A=0;
        }
        if(Math.abs(B)<0.01) {
            B=0;
        }
        System.out.printf("%.2f",A);
        System.out.printf("%.2f",B);
    }
}
