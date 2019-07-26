package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1037 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] P=in.nextLine().split("\\s+");
        String[] a=P[0].split("\\.");
        String[] b=P[1].split("\\.");
        int i,o,p;
        int a0= Integer.parseInt(a[0]);
        int a1= Integer.parseInt(a[1]);
        int a2= Integer.parseInt(a[2]);
        int b0=Integer.parseInt(b[0]);
        int b1=Integer.parseInt(b[1]);
        int b2=Integer.parseInt(b[2]);
        if(bj(a,b)){
            if(b2>=a2){
                p=b2-a2;
            }else{
                p=b2+29-a2;
                b1--;
            }
            if(b1>=a1){
                o=b1-a1;
            }else {
                o=b1+17-a1;
                b0--;
            }
            i=b0-a0;
            System.out.printf("%d.%d.%d\n",i,o,p);
        }else {
            if(a2>=b2){
                p=a2-b2;
            }else {
                p=a2+29-b2;
                a1--;
            }
            if(a1>=b1){
                o=a1-b1;
            }else {
                o=a1+17-b1;
                a0--;
            }
            i=a0-b0;
            System.out.printf("-%d.%d.%d\n",i,o,p);
        }

    }
    private static boolean bj(String[] m, String[] n){
        int m1=Integer.parseInt(m[0]);
        int m2=Integer.parseInt(m[1]);
        int m3=Integer.parseInt(m[2]);
        int n1=Integer.parseInt(n[0]);
        int n2=Integer.parseInt(n[1]);
        int n3=Integer.parseInt(n[2]);
        if(m1>n1){
            return false;
        }else if(m1==n1){
            if(m2>n2){
                return false;
            }else if(m2==n2){
                if(m3>n3){
                    return false;
                }else return true;
            }else return true;
        }else return true;
    }
}

