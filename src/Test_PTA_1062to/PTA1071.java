package Test_PTA_1062to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] cj=br.readLine().split(" ");
        int T=Integer.parseInt(cj[0]);
        int K=Integer.parseInt(cj[1]);
        for(int i=0;i<K;i++){
            String[] l=br.readLine().split(" ");
            int n1=Integer.parseInt(l[0]);
            int n2=Integer.parseInt(l[3]);
            int b=Integer.parseInt(l[1]);
            int t=Integer.parseInt(l[2]);
            if(T!=0) {
                if (t <= T) {
                    if ((b == 0 && n2 < n1) || (b == 1 && n2 > n1)) {
                        T = T + t;
                        System.out.println("Win " + t + "!  Total = " + T);
                    } else {
                        T = T - t;
                        System.out.println("Lose " + t + ".  Total = " + T);
                    }
                } else {
                    System.out.print("Not enough tokens.  Total = " + T);
                }
            }else {
                System.out.print("Game Over.");
                break;
            }
        }
        br.close();
    }
}
