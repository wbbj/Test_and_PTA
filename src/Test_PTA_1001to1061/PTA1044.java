package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1044 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String []a={"tam","hel" , "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};
        String []b={"jan", "feb", "mar", "apr", "may", "jun", "jly", "aug","sep" ,"oct", "nov", "dec"};
        int N=Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            String s = in.readLine();
            int r = 0;
            int a1,a2;
            if (s.matches("[0-9]{1,}")) {
                r=Integer.valueOf(s);
                if (r==0) {
                    System.out.println("tret");
                    continue;
                }
                if (r<13) {
                    a1 = r%13;
                    System.out.println(b[a1-1]);
                }
                if (12<r&&r<169) {
                    a2 = r/13;
                    a1 = r-a2*13;
                    if (a1==0) {
                        System.out.println(a[a2-1]);
                    }else {
                        System.out.println(a[a2-1]+" "+a[a1-1]);
                    }

                }
            }else{
                if (s.equals("tret")) {
                    System.out.println(0);
                    continue;
                }
                String[] split = s.split(" ");
                if (split.length!=1) {
                    a1 = getIndex(b, split[1]);
                    a2 = getIndex(a, split[0]);
                    System.out.println(a2*13+a1);
                }else {
                    a1 = getIndex(b, split[0]);
                    a2 = getIndex(a, split[0]);
                    if (a1!=0) {
                        System.out.println(a1);
                    }else {
                        System.out.println(a2*13);
                    }

                }
            }
        }
    }
    public static int getIndex(String[] arr,String value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i+1;
            }
        }
        return 0;
    }
}