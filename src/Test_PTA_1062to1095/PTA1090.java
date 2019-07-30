package Test_PTA_1062to1095;

import test.S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1090 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int N=Integer.parseInt(a[0]);
        int M=Integer.parseInt(a[1]);
        String[][] huowu=new String[N][2];
        for (int i=0;i<N;i++){
            String m=br.readLine();
            huowu[i][0]=m.split(" ")[0];
            huowu[i][1]=m.split(" ")[1];
        }

        for(int i=0;i<M;i++){
            String b=br.readLine();
            int K=Integer.parseInt(b.split(" ")[0]);
            String[] G=new String[K];
            int count=0,count1=0;
            for(int j=0;j<K;j++){
                G[j]=b.split(" ")[j+1];
                for(int t=0;t<N;t++) {
                    if ((G[j].equals(huowu[t][0])&&b.contains(huowu[t][1])||(G[j].equals(huowu[t][1])&&b.contains(huowu[t][0])))){
                        count1++;

                    }
                    else {
                        count++;
                    }
                }
            }
            if(count1!=0){
                System.out.println("No");
            }
            else if(count==K*N){
                System.out.println("Yes");
            }

        }
    }
}
