package Test_PTA_1062to1095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int N=Integer.parseInt(a[0]);
        int M=Integer.parseInt(a[1]);
        String[] b=new String[M];
        for(int i=0;i<M;i++){
            b[i]=br.readLine();
        }
        int[] c=new int[N];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                c[i] += Integer.parseInt(b[j].split(" ")[i]);//计算每种月饼的编号
            }
        }
        int max=c[0];

        for (int i=0;i<N;i++){//找出最大值
            if(c[i]>=max){
                max=c[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<N;i++){//输出最大值对应的所有序号
            if(c[i]==max){
                System.out.print(i+1+" ");
            }
        }


    }
}
