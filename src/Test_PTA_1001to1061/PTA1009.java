package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1009 {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] S=s.split(" ");
        for(int i=S.length-1;i>=0;i--){
            System.out.print(S[i]+" ");
        }
    }
}
