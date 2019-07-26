package Test_PTA_1001to1061;

import java.util.Arrays;
import java.util.Scanner;

public class PTA1039 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] t=in.next().split("");
        String[] x=in.next().split("");
        String m= Arrays.toString(t);
        int count=0;
            for(int j=0;j<x.length;j++) {
                if (m.contains(x[j])){
                    count++;
                    m = m.replaceFirst(x[j],"");
                }
            }
            if(count==x.length){
                System.out.println("yes"+" "+(t.length-count));
            }else {
                System.out.println("no"+" "+(x.length-count));
            }

    }
}
