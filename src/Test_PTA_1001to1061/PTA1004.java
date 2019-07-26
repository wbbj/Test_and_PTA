package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[][] Stu = new String[n][3];//声明输入学生信息的二维数组
        int[] result = new int[n];//声明存放学生成绩的数组
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                Stu[i][j]=in.next();
            }
            result[i]=Integer.parseInt(Stu[i][2]);//将成绩单独存入数组
        }
        int max,min,MAX,MIN;
        MAX=MIN=0;
        max=min=result[0];
        for(int i=1;i<n;i++){//比较成绩，找出最大成绩和最小成绩
            if(result[i]>max){
                max=result[i];
                MAX=i;
            }
            if(result[i]<min){
                min=result[i];
                MIN=i;
            }
        }
        System.out.println(Stu[MAX][0]+" "+Stu[MAX][1]);
        System.out.println(Stu[MIN][0]+" "+Stu[MIN][1]);
    }
}