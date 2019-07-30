package Test_PTA_1062to1095;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTA1088 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int M=in.nextInt();
        int X=in.nextInt();
        int Y=in.nextInt();
        int temp=0;

        for(int i=99;i>9;i--){
            double b0=(double) Math.abs(i - fanzhuan(i)) / (double)X;
            double b1=(double) fanzhuan(i) / (double)Y;
            if (b0==b1){//找出符合条件的甲
                temp=i;
                break;
            }
        }
        if(temp==0){
            System.out.println("No Solution");
        }else {
            System.out.println(M+" "+compare(M,temp)+" "+compare(M,fanzhuan(temp))+" "+compare(M,fanzhuan(temp)/Y));
        }



    }
    private static int fanzhuan(int a){//反转
        String m=a+"";
        ArrayList<String > list=new ArrayList<>();
        Collections.addAll(list,m.split(""));
        Collections.reverse(list);
        return Integer.parseInt(String.join("",list));

    }
    private static String compare(int M,int jy){//与甲乙比较
        if(M==jy){
            return "Ping";
        }else if(M>jy){
            return "Gai";
        }else {
            return "Cong";
        }
    }
    private static String compare(int M,double b){//与丙比较
        if((double) M==b){
            return "Ping";
        }else if((double)M>b){
            return "Gai";
        }else {
            return "Cong";
        }
    }
}
