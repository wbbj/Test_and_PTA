package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PTA1055 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);//人数
        int k = Integer.parseInt(split[1]);//队数
        People[] peoples = new People[n];
        for (int i = 0; i < n; i++) {//读入n个人的名字、身高信息
            String[] s = br.readLine().split(" ");
            peoples[i] = new People(s[0], Integer.parseInt(s[1]));//获取姓名和对应的身高
        }
        br.close();

        Arrays.sort(peoples);//排序

        int per = n / k;//每队的人数
        for (int i = k; i >= 1; i--) {//一共分了k队，对排好序的数组，从后往前一队一队的处理，达到题目要求的结果
            int len;
            int index;
            if (i == k) {
                len = n - k * per + per;//最后一队的长度，可能大于k
                index = n-1;
            } else {
                len = per;
                index = i * per - 1;
            }

            People[] temp = new People[len];
            int left = len / 2;
            int right = len / 2;
            temp[left] = peoples[index--];
            left--;
            right++;
            while (left >= 0 && right < len) {
                temp[left--] = peoples[index--];
                temp[right++] = peoples[index--];
            }

            if (left >= 0) {
                temp[left] = peoples[index];
            } else if (right < len) {
                temp[right] = peoples[index];
            }

            for (int j = 0; j < len - 1; j++) {
                System.out.print(temp[j].name + " ");
            }
            System.out.println(temp[len - 1].name);
        }
    }

}

class People implements Comparable<People> {
    String name;
    private int high;

    People(String name, int high) {
        this.name = name;
        this.high = high;
    }

    @Override
    public int compareTo(People o) {
        if (this.high < o.high) {
            return -1;
        } else if (this.high > o.high) {
            return 1;
        } else {
            return -this.name.compareTo(o.name);
        }
    }
}