package Test_Ahsf;

import java.util.Scanner;

public class QQ_JmDl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] q=new int[N];
        for(int i=0;i<N;i++){
            q[i]=sc.nextInt();
        }
        int head=1;
        while (N>1){
            System.out.print(q[0]);
            int temp=q[head];

            System.arraycopy(q, 1, q, 0, N - 1);
            q[N-1]=temp;
            System.arraycopy(q, 1, q, 0, N - 1);
            N--;
        }
    }
}
