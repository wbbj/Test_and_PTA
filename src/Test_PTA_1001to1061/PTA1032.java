package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 1;

        int[] scores = new int[n];
        String[] temp;
        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            int id = Integer.parseInt(temp[0]);
            int tscore = Integer.parseInt(temp[1]);
            scores[id] += tscore;
            if (scores[max] < scores[id])
                max = id;
        }
        System.out.println(max + " " + scores[max]);
    }
}
