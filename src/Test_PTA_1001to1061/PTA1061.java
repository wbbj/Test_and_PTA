package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int N=Integer.parseInt(a[0]);
        int M=Integer.parseInt(a[1]);
        String[] sccor=br.readLine().split(" ");
        String[] daan=br.readLine().split(" ");
        int[] total=new int[N];
        for(int i=0;i<N;i++) {
            String[] stu=br.readLine().split(" ");
            for(int j=0;j<M;j++){
                if(stu[j].equals(daan[j])){
                    total[i]+=Integer.parseInt(sccor[j]);
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.println(total[i]);
        }
    }
}
