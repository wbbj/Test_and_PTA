package Test_PTA_1062to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PTA1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        double[] k=new double[N];
        for(int i=0;i<N;i++){
            String[] m=br.readLine().split(" ");
            k[i]= Math.sqrt(Math.pow(Integer.parseInt(m[0]),2)+Math.pow(Integer.parseInt(m[1]),2));

        }
        br.close();
        Arrays.sort(k);
        System.out.printf("%.2f",k[N-1]);
    }
}
