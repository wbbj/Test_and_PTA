package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1056 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] n=br.readLine().split(" ");
        int N=Integer.parseInt(n[0]);
        int sum=0;
        if(N>1&&N<10){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    sum+=Integer.parseInt(n[i] )* 10 + Integer.parseInt(n[j]);
                }
            }
            for(int i=1;i<=N;i++){
                    sum-=Integer.parseInt(n[i] )* 10 + Integer.parseInt(n[i]);
            }
            System.out.println(sum);
        }
    }
}
