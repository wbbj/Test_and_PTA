package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PTA1045 {
    public static void main(String[] args) throws Exception {
        int max = 0, index = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n], b = new int[n], v = new int[n];
        String[] in = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(in[i]);
            b[i] = a[i];
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i] && b[i] > max)
                v[index++] = b[i];
            if (b[i] > max)
                max = b[i];
        }
        System.out.println(index);
        for (int i = 0; i < index - 1; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println(v[index - 1]);
    }
}
