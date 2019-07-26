package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String [][] x=new String[n][1];
        if (n < 10) {
            for (int i = 0; i <n; i++) {
                String s1 = in.nextLine();
                String s2 = s1;
                if (s1.contains("P") && s1.contains("A") && s1.contains("T")) {//判断是否包含字符
                    s1 = s1.replace("P", "");//replace用后面的的替换前面的
                    s1 = s1.replace("A", "");
                    s1 = s1.replace("T", "");
                    s1 = s1.replace("\\s+", "");//  ‘\\s+’任意空白字符
                    if (s1.isEmpty()) {
                        int a = s2.indexOf("P");
                        int b = s2.indexOf("T") - s2.indexOf("P")-1;
                        int c = s2.length() - s2.indexOf("T")-1;
                        if (a * b == c) {
                           x[i][0]="YES";
                        } else {
                            x[i][0]="NO";
                        }
                    }else {
                        x[i][0]="NO";
                    }

                } else {
                    x[i][0]="NO";
                }
            }

        }for (int j=0;j<n;j++){
            System.out.println(x[j][0]);
        }
    }
}
//1.如果PAT正确，那么PAAT也正确；如果PAAT正确，那么PAAAT也正确；……以此类推。
//2.如果APATA正确，那么APAATAA也正确；如果APAATAA正确，那么APAAATAAA也正确；……以此类推。
//3.如果AAPATAA正确，那么AAPAATAAAA也正确；……以此类推。