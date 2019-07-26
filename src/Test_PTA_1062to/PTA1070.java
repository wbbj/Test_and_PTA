package Test_PTA_1062to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class PTA1070 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] s = new int[n];
        String[] sp = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
            s[i]  = Integer.parseInt(sp[i]);
        Arrays.sort(s);
        int res = s[0];
        for(int i = 1; i < n; i++)
            res = (res + s[i]) / 2;
        System.out.println(res);
    }
}