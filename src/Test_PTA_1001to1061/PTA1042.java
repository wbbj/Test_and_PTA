package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1042 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String l=in.nextLine().toLowerCase();
        int[] c=new int[26];

        for(int i=0;i<l.length();i++){
            char m=l.charAt(i);
            if(m>='a'&&m<='z'){
               c[m-'a']++;
            }
        }
        int max=0;
        char mc=0;
        for(int i=0;i<26;i++){
            if(c[i]>max){
                max=c[i];
                mc= (char) ((char)i+'a');
            }
        }
        System.out.println(mc+" "+max);
    }
}
