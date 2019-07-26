package Test_PTA_1062to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] sm = s[0].split("/");
        int n1 = Integer.parseInt(sm[0]), m1 = Integer.parseInt(sm[1]);//第一个分母和分子
        String[] bi = s[1].split("/");
        int n2 = Integer.parseInt(bi[0]), m2 = Integer.parseInt(bi[1]);//第二个分母和分子
        int k = Integer.parseInt(s[2]);
        if(n1 * m2 > n2 * m1) {//替换一下位置使其从小到大方便后面使用
            int temp = n1;
            n1 = n2;
            n2 = temp;
            temp = m1;
            m1 = m2;
            m2 = temp;
        }
        int num = 1;//这是num/k中的num,num为分子
        while(n1 * k >= m1 * num) {//使num/k比/n1/m1大获得num的值
            num++;
        }
        while(n1 * k < m1 * num && m2 * num < n2 * k) {//在num/k比n2/m2小的情况下增加num的值,当k与num的最大公约为1时获得一个题目要求的分数,同时能保证从小到大输出
            if(gcd(k, num) == 1) {
                System.out.print(num+"/"+k+" ");
            }
            num++;
        }
    }
    private static int gcd(int a, int b){//求最大公约数
        int t=0;
        while (a%b!=0){
            t=a%b;
            a=b;
            b=t;
        }
        return b;
    }
}
