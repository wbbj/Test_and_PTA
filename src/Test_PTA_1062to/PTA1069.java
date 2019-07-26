package Test_PTA_1062to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] l=br.readLine().split(" ");
        int M=Integer.parseInt(l[0]);
        int N=Integer.parseInt(l[1]);
        int S=Integer.parseInt(l[2]);
        String[] c=new String[M];
        for(int i=0;i<M;i++){
            c[i]=br.readLine();
        }
        StringBuilder r=new StringBuilder();
        if(S<=N) {
            for (int i = S; i < M; i = i + N) {
                if (r.toString().contains(c[i-1])) {
                    r.append(c[i]);
                    r.append(" ");
                } else {
                    r.append(c[i-1]);
                    r.append(" ");
                }
            }
            String[] b=r.toString().split(" ");
            for(int i=0;i<b.length;i++){
                System.out.println(b[i]);
            }
        }else {
            System.out.print("Keep going...");
        }

    }
}
