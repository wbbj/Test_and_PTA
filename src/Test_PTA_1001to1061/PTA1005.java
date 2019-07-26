package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1005 {
    public static void main (String [] args){
        Scanner in =new Scanner(System.in);
        int num =in.nextInt();
        int []testNum=new int[num];//声明输入数字的数组
        int []result=new int[10000];//声明猜想数字的数组
        for(int i=0;i<num;i++)
        {
            testNum[i]=in.nextInt();//输入num个数字
        }
        result=myMethod(testNum);//获得所有猜想数字
        for(int i=0;i<num;i++)//将覆盖数移除
        {
            for(int j=0;j<10000;j++)
            {
                if(result[j]==testNum[i])
                {
                    testNum[i]=0;
                    break;
                }
            }
        }
        for(int i=0;i<num;i++)// 冒泡排序 
        {
            boolean tempBool=true;
            for(int j=0;j<num-i-1;j++)
            {
                if(testNum[j]<testNum[j+1])
                {
                    int[]temp= {testNum[j]};
                    testNum[j]=testNum[j+1];
                    testNum[j+1]=temp[0];
                    tempBool=false;
                }
            }
            if(tempBool)
            {
                break;
            }
        }

        for(int i:testNum)//输出答案
        {
            if(i!=0)
            {
                System.out.print(i+" ");
            }

        }
    }
    public static int[] myMethod(int[]testNum)//求所有猜想数字的方法

    {
        int[]temp=new int[10000];
        int tempCount=0;
        for(int i =0;i<testNum.length;i++)
        {
            int m=testNum[i];
            for(int j=0;j<testNum[i];j++)
            {

                if(m%2==0)
                {
                    temp[tempCount]=m/2;
                    m=m/2;
                    tempCount++;
                }
                else
                {
                    temp[tempCount]=(3*m+1)/2;
                    m=(3*m+1)/2;
                    tempCount++;
                }
            }

        }
        return temp;
    }
} 