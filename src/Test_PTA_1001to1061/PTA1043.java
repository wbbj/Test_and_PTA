package Test_PTA_1001to1061;
import java.util.Scanner;

public class PTA1043 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a[]=in.nextLine().split("");
        int P=0,A=0,T=0,e=0,s=0,t=0
                ;
        for (String value : a) {
            if (value.equals("P")) {
                P++;
            }
            if (value.equals("A")) {
                A++;
            }
            if (value.equals("T")) {
                T++;
            }
            if (value.equals("e")) {
                e++;
            }
            if (value.equals("s")) {
                s++;
            }
            if (value.equals("t")) {
                t++;
            }
        }
        int z=P+A+T+e+s+t;
        while (z>0){
            if(P>0){
                System.out.print("P");
                P--;
            }
            if(A>0){
                System.out.print("A");
                A--;
            }if(T>0){
                System.out.print("T");
                T--;
            }if(e>0){
                System.out.print("e");
                e--;
            }if(s>0){
                System.out.print("s");
                s--;
            }if(t>0){
                System.out.print("t");
                t--;
            }
            z--;
        }
    }
}
