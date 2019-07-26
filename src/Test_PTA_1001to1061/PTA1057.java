package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PTA1057 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();

        int sum = 0;
        char[] a = s.toCharArray();
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= 'a' && a[i] <= 'z') {
                sum += a[i] - 'a' + 1;
            }
        }
        int y = 0, l = 0;
        while(sum != 0) {
            if(sum % 2 == 0)
                l++;
            else
                y++;
            sum = sum / 2;
        }
        System.out.println(l + " " + y);
    }
}
