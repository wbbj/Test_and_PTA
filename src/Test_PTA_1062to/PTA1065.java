package Test_PTA_1062to;

import java.util.Arrays;
import java.util.Scanner;

public class PTA1065 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();//夫妻对数
        String [][] p=new String[N][2];//存放夫妻id
        for(int i=0;i<N;i++){
            for(int j=0;j<2;j++){
                p[i][j]=in.next();//夫妻组合
            }
        }
        int M=in.nextInt();//派对人数
        String [] k=new String[M];//存放派对人员id
        StringBuilder d=new StringBuilder();//存放落单人员信息
        for(int i=0;i<M;i++){
            k[i]=in.next();
        }
        String b= Arrays.deepToString(p);//用于比较
        String a=Arrays.deepToString(k);
        for(int i=0;i<M;i++){
            if(!b.contains(k[i])){
                d.append(k[i]);
                d.append(" ");//方便后面分割
            }else {
                for (int j=0;j<N;j++){
                    if(p[j][0].equals(k[i])){
                        for(int l=0;l<M;l++){
                            if(!a.contains(p[j][1])){
                                d.append(k[i]);
                                d.append(" ");
                                break;
                            }
                        }
                    }else if(p[j][1].equals(k[i])){
                        for(int l=0;l<M;l++){
                            if(!a.contains(p[j][0])){
                                d.append(k[i]);
                                d.append(" ");
                                break;
                            }
                        }
                    }
                }

            }
        }
        String[] m=d.toString().split(" ");
        Arrays.sort(m);
        for (int i=0;i<m.length;i++) {
            System.out.print(m[i]+" ");
        }
    }
}
