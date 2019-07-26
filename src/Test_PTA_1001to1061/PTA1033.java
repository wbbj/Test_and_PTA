package Test_PTA_1001to1061;

import java.util.Arrays;
import java.util.Scanner;

public class PTA1033 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] error=in.nextLine().split("");
        String[] put=in.nextLine().split("");
        StringBuilder l=new StringBuilder();
        if(Arrays.toString(error).contains("+")) {
            String p= Arrays.toString(put).replaceAll("[A-Z]", "");//替换掉所有大写字母
            StringBuilder m=new StringBuilder();
            m.append(p);
            String[] m0=m.toString().split("");
            for (int i = 0; i < m0.length; i++) {
                if(!Arrays.toString(error).toLowerCase().contains(m0[i].toLowerCase())){//判断是否包含坏掉的按键
                    l.append(m0[i]);
                }
            }
            System.out.println(l);
        }else {
            for (int i = 0; i < put.length; i++) {
                if(!Arrays.toString(error).toLowerCase().contains(put[i].toLowerCase())){
                    l.append(put[i]);
                }
            }
            System.out.println(l);
        }
    }
}
