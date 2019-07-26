package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1040 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] s = in.readLine().toCharArray();
        in.close();
        int countP = 0, countT = 0;
        long pat = 0;
        for (char c : s) {
            if (c == 'T')
                countT++;
        }
        for (char c : s) {
            if (c == 'P')
                countP++;
            if (c == 'T')
                countT--;
            if (c == 'A') {
                pat = pat + countP * countT;
                if (pat > 1000000007)
                    pat = pat % 1000000007;
            }
        }
        System.out.println(pat);
    }
}