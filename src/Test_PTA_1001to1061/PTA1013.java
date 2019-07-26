package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        long[] primeNums = new long[N];	//创建数组，用于存储第1-N位的素数
        int count = 0;					//存储当前查找的素数的数量
        int i = 2;
        while(count < N) { //从2开始遍历，直到找出N个素数
            if (isPrime(i)) {
                primeNums[count] = i;
                count++;
                i++;
            }
            else {
                i++;
            }
        }
        StringBuffer SB = new StringBuffer();
        for (int j = M-1; j < N; j++) {//从第M个素数开始输出，每一行输出10个
            if (j % 10 != (M-2)%10) {
                SB.append(primeNums[j]).append(" ");
            }
            else {
                SB.append(primeNums[j]).append("\n");
            }
        }
        SB.deleteCharAt(SB.length()-1);//删除StringBuffer结尾附加的空格或者换行符
        System.out.println(SB);
    }
    public static boolean isPrime(long n){//判断整数n是不是素数
        for (int k = 2; k <= Math.sqrt(n); k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }
}
