package Test_PTA_1062to1095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] A=br.readLine().split("");
        String [] B=br.readLine().split("");
        StringBuilder sb=new StringBuilder();
        for (String s : A) {
            if (!sb.toString().contains(s)) {
                sb.append(s);
            }
        }
        for (String s : B) {
            if (!sb.toString().contains(s)) {
                sb.append(s);
            }
        }
        System.out.println(sb);
    }
}
