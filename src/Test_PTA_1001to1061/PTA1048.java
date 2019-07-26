package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String k=br.readLine();
        String[] l= k.split("\\s+");
        String[] a=l[0].split("");
        String[] b=l[1].split("");
        int m=a.length-1;
        StringBuilder c=new StringBuilder();
        for(int i=(b.length-1);i>=0;i--) {
            if (m >= 0) {
                if (Integer.parseInt(a[m]) % 2 == 1) {//为奇数
                    String d = String.valueOf((Integer.parseInt(b[i]) + Integer.parseInt(a[m])) % 13);
                    if (Integer.parseInt(d) == 10) {
                        c.append("J");
                    }
                    if (Integer.parseInt(d) == 11) {

                        c.append("Q");
                    }
                    if (Integer.parseInt(d) == 12) {
                        c.append("J");
                    }
                    if (Integer.parseInt(d) < 10 && Integer.parseInt(d) >= 0) {
                        c.append(Integer.parseInt(d));
                    }

                }
                if (Integer.parseInt(a[m]) % 2 == 0) {//为偶数
                    int d = Integer.parseInt(b[i]) - Integer.parseInt(a[m]);
                    if (d >= 0) {
                        c.append(d);
                    }
                    if (d < 0) {
                        d = d + 10;
                        c.append(d);
                    }
                }
                m--;
            }
            if(m<0){//B对应A位置没数了直接跳出循环
                break;
            }
        }
        for(int i=b.length-a.length-1;i>=0;i--){
            c.append(b[i]);
        }

        System.out.println(c.reverse());
    }
}
