package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] t=br.readLine().split(" ");
        int N=Integer.parseInt(t[0]);
        double e=Double.parseDouble(t[1]);
        int D=Integer.parseInt(t[2]);
        int pB=0,b=0;
        for(int i=0;i<N;i++){
            String[] d=br.readLine().split(" ");
            int pb=0;
            if(Integer.parseInt(d[0])<=D){
                for(int j=1;j<d.length;j++){
                    if(Double.parseDouble(d[j])<e){
                        pb++;
                    }
                }
                if(pb>Integer.parseInt(d[0])/2){
                    pB++;
                }
            }else {
                for (int j = 1; j < d.length; j++) {
                    if (Double.parseDouble(d[j]) < e) {
                        pb++;
                    }
                }
                if (pb > Integer.parseInt(d[0]) / 2) {
                    b++;
                }
            }
        }br.close();
        System.out.printf("%.1f%% %.1f%%",pB*100.0/N,b*100.0/N);
    }
}
