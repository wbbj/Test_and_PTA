package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PTA1038 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[101];
        int N = Integer.parseInt(br.readLine());

        String[] in = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            score[Integer.parseInt(in[i])]++;
        }
        String[] s = br.readLine().split(" ");
        int k = Integer.parseInt(s[0]);
        for (int i = 0; i < k - 1; i++) {
            System.out.print(score[Integer.parseInt(s[i + 1])] + " ");
        }
        System.out.print(score[Integer.parseInt(s[s.length - 1])]);

    }

}