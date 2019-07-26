package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1024 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String info=br.readLine();
        br.close();
        String[] s=info.split("E");
        String[] s1=s[0].split("\\.");
        String[] s2=s[0].split("");
        StringBuilder sb;
        sb = new StringBuilder();

        //处理正负号
        if(s2[0].equals("-")) {
            sb.append("-");
        }

        //处理
        int k=Integer.parseInt(s[1]);
        if(k<0) {
            sb.append("0.");
            for(int i=1;i<(-1)*k;i++) {
                sb.append("0");
            }
            sb.append(s2[1]);
            sb.append(s1[1]);
        }else {
            sb.append(s2[1]);
            if(k<s1[1].length()) {
                sb.append(s1[1].substring(0, k));
                sb.append(".");
                sb.append(s1[1].substring(k, s1[1].length()));
            }else {
                sb.append(s1[1]);
                for(int i=s1[1].length();i<k;i++) {
                    sb.append("0");
                }
            }
        }
        System.out.println(sb.toString());
    }
}