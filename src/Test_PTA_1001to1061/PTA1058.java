package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1058 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);//学生人数
        int m = Integer.parseInt(s[1]);//题目总数
        int[] score = new int[m];//每道题的总分
        int[] wrong = new int[m];//每道题做错人数
        String[] right = new String[m];//每道题的正确答案

        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            score[i] = Integer.parseInt(str.substring(0, 1));
            right[i] = str.substring(4);
        }
        int[] total = new int[n];//学生成绩总分
        for(int i = 0; i < n; i++) {
            String t = br.readLine();
            t = t.substring(t.indexOf('(') + 1, t.lastIndexOf(')'));
            String[] d = t.split("\\)\\s*\\(");
            for(int j = 0; j < d.length;j++) {
                if(d[j].equals(right[j])) {
                    total[i] += score[j];
                }else {
                    wrong[j]++;
                }
            }
            System.out.println(total[i]);
        }
        int max = 0;
        for(int i = 1; i < m; i++) {
            if(wrong[max] < wrong[i])
                max = i;
        }
        if(wrong[max] == 0) {
            System.out.println("Too simple");
        }else {
            System.out.print(wrong[max]);
            for(int i = 0; i < m; i++) {
                if(wrong[i] == wrong[max]) {
                    System.out.printf(" %d", i + 1);
                }
            }
        }
    }
}