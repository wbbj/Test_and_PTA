package Test_PTA_1001to1061;

import java.util.Arrays;
import java.util.Scanner;

public class PTA1059 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        String[] ID=new String[N];
        for(int i=0;i<N;i++){
            ID[i]=in.next();//所有人的ID
        }
        int K=in.nextInt();
        String[] checkID=new String[K];
        for(int i=0;i<K;i++){
            checkID[i]=in.next();//要检查的ID
        }
        for(int i=0;i<K;i++) {
            if (Arrays.toString(ID).contains(checkID[i])) {
                if (checkID[i].equals(ID[0])) {//冠军人员
                    System.out.println(checkID[i] + ": Mystery Award");

                } else {//非冠军
                    for (int j = 0; j < N; j++) {
                        if (checkID[i].equals(ID[j])) {
                            if (isPrime(j + 1)) {//判断检测到的数是否为素数排名是则进入判断否则输出其他排名
                                int k = i - 1;
                                while (k >= 0) {
                                    if (checkID[i].equals(checkID[k])) {//检测到与之前检测过的相同ID
                                        k = -2;
                                    } else k--;
                                }
                                if (k == -1) {//未检测到相同ID
                                    System.out.println(checkID[i] + ": Minion");
                                }
                                if (k == -2) {//检测到相同ID
                                    System.out.println(checkID[i] + ": Checked");
                                }
                            } else {//其他非素数排名人员
                                System.out.println(checkID[i] + ": Chocolate");
                            }
                        }
                    }
                }
            } else {//无此ID
                System.out.println(checkID[i] + ": Are you kidding?");

            }
        }
    }
    private static boolean isPrime(long n){//判断整数n是不是素数
        for (int k = 2; k <= Math.sqrt(n); k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }
}

