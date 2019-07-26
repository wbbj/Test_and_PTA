package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1047 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] sccor = new int[1001];
        for (int i=0;i<6;i++) {
            String[] b = in.next().split("-");
            int t=Integer.parseInt(b[0]);
            sccor[t]+=in.nextInt();
        }
        int max=0,bh=0;
        for(int i=0;i<sccor.length;i++){
            if(sccor[i]>max){
                max=sccor[i];
                bh=i;
            }
        }
        System.out.println(bh+" "+max);

    }
}
