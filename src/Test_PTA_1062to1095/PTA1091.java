package Test_PTA_1062to1095;

import java.util.Scanner;

public class PTA1091 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int n=0;

        for(int i=0;i<N;i++){
            n=in.nextInt();
            int d=0;
            for(int j=1;j<10;j++){
                String[] t=(j*(int)Math.pow(n,2)+"").split("");
                String[] x=(n+"").split("");
                int m=t.length-1;
                for(int l=x.length-1;l>=0;l--){//从最后一位比较
                    if(x[l].equals(t[m])){
                        m--;
                    }
                    else {
                        break;
                    }
                }
                if(m==t.length-1-x.length){//比较完后如果全全相等每一步都有m--
                    d=j;
                    break;//以免找到后面的更大数
                }
            }
            if(d!=0){
                System.out.println(d+" "+d*(int)Math.pow(n,2));
            }else {
                System.out.println("No");
            }

        }
    }
}
