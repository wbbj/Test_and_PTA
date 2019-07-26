package Test_PTA_1001to1061;


import java.util.Arrays;
import java.util.Scanner;

public class PTA1050 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] l=new int[N];
        for(int i=0;i<N;i++){
            l[i]=in.nextInt();
        }
        Arrays.sort(l);
        int m=mn(N);
        int n=N/m;
        int k=N-1;
        int[][] ls=new int[m][n];
        for(int count=0;count*2<n;count++){
            for(int j=count;j<n-count;j++){
                ls[count][j]=l[k--];
            }
            for(int i=count+1;i<m-count;i++){
                ls[i][n-1-count]=l[k--];
            }
            for(int j=n-2-count;j>=count;j--){
                ls[m-1-count][j]=l[k--];
            }
            if(n-1-count>count){
                for(int i=m-2-count;i>=count+1;i--){
                    ls[i][count]=l[k--];
                }
            }
        }
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(ls[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static int mn(int N){
        int m=0,n=0,tc=0;

        int[][] t = new int[(int) Math.sqrt(N)][2];
        for(int i=1;i<Math.sqrt(N);i++){
            if(N%i==0){
                m=N/i;
                n=i;
                if(m>n) {
                    t[tc][0] = m;
                    t[tc][1] = m - n;
                    tc++;
                }
                else {
                    break;
                }
            }
        }
        int min=t[0][1],mm=0;
        for(int i=0;i<tc;i++){
            if(t[i][1]<=min){
                min=t[i][1];
                mm=t[i][0];
            }
        }
        return mm;
    }
}
