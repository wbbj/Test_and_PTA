package Test_PTA_1062to1095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");//学生人数和物品种类
        String b=br.readLine();//要查物品编号
        int N=Integer.parseInt(a[0]);
     //后面发现M没用上
//        int M=Integer.parseInt(a[1]);

        int counts=0,countw=0;
        for(int i=0;i<N;i++){
            int countw1=0;
            int[] m=new int[6];
            String[] c=br.readLine().split(" ");
            String name=c[0];
            int K=Integer.parseInt(c[1]);
            for(int j=2;j<K+2;j++){
                if(b.contains(c[j])){
                    m[countw1]=j;//记录查缴的物品
                    countw++;//记录查缴物品总数
                    countw1++;//用来判断
                }
            }
            if(countw1!=0) {
                counts++;//记录查缴物品学生数
                System.out.print(name+":");
                for(int l=0;l<countw1;l++){
                    System.out.print(" "+c[m[l]]);
                }
                System.out.println();
            }
        }
        System.out.println(counts+" "+countw);

    }
}
