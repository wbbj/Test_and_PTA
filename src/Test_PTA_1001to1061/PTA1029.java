package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1029 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] a=in.nextLine().toUpperCase().split("");//先将输入的字符串转换为大写
        String b=in.nextLine().toUpperCase();
        String c="";
        //然后用contains比较两行字符
        for(int i=0;i<a.length;i++){
            if(!b.contains(a[i])){//判断按键损坏
                if(!c.contains(a[i])) {//判断重字符
                    c += a[i];
                }
            }
        }
        System.out.println(c);
    }
}
