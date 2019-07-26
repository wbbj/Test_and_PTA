package Test_PTA_1001to1061;

import java.util.Scanner;


public class PTA1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[]count = {0,0,0,0,0,0,0,0,0,0};
        int l = s.length();

        for(int i=0 ;i<l ;i++){
            count[s.charAt(i)-48]++;
        }

        for(int i=0 ;i<10 ;i++){
            if(count[i]!=0){
                System.out.printf("%d:%d\n",i,count[i]);
            }
        }

    }
}