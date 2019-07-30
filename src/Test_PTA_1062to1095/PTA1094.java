package Test_PTA_1062to1095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int L=Integer.parseInt(a[0]);
        int K=Integer.parseInt(a[1]);

        String N=br.readLine();
        for(int i=0;i<L;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<K+i;j++){//从第一位开始每次移动一位,每次存从这一位开始的K位数到sb中
                sb.append(N.split("")[j]);
            }
            if(is(Integer.parseInt(sb.toString()))){//是素数则输出并跳出循环
                System.out.println(sb.toString());
                break;
            }
        }
    }
    private static Boolean is(int m){
        for (int i=2;i<=Math.sqrt(m);i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}
