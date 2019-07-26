package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1001 {
    public static void main(String args[]) {
        int n=new Scanner(System.in).nextInt();
        int i=0;
        if(n<=1000) {
            while(n!=1) {

                if(n%2==0){
                    n=n/2;
                    i++;
                }
                else{
                    n=(3*n+1)/2;
                    i++;
                }


            }
        }System.out.print(i);

    }
}

