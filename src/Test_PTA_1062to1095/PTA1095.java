package Test_PTA_1062to1095;

import test.S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int N=Integer.parseInt(a[0]);
        int M=Integer.parseInt(a[1]);
        String[] stu=new String[N];
        for(int i=0;i<N;i++){
            stu[i]=br.readLine();
        }
        for(int i=0;i<M;i++){//M次要求
            String yq=br.readLine();//获取要求

            //条件为1
            if(yq.split(" ")[0].equals("1")){
                System.out.println();
                String[] case1=new String[N];
                int m=0;
                for(int j=0;j<N;j++){
                    if(stu[j].split(" ")[0].split("")[0].equals(yq.split(" ")[1])){//将符合条件的学生放入新数组
                        case1[m]=stu[j];
                        m++;
                    }
                }
                //冒泡排序
                for(int l=0;l<m;l++) {
                    for (int j = 1; j < m-l; j++) {
                        //为了方便书写先定义下
                        int after = Integer.parseInt(case1[j].split(" ")[1]);
                        int before = Integer.parseInt(case1[j - 1].split(" ")[1]);
                        //比较总分
                        if (after > before) {
                            String temp = case1[j];
                            case1[j] = case1[j - 1];
                            case1[j - 1] = temp;
                        }
                        //比较名字
                        else if (after==before) {
                            if ((case1[j].split(" ")[0]).compareTo(case1[j - 1].split(" ")[0]) < 0) {
                                String temp = case1[j];
                                case1[j] = case1[j - 1];
                                case1[j - 1] = temp;
                            }
                        }
                    }
                }
                //输出
                System.out.println("Case "+(i+1)+": "+yq);
                for(int j=0;j<m-1;j++){
                    System.out.println(case1[j]);
                }
                System.out.print(case1[m-1]);//为了输出没有多余换行
            }
            //条件2
            else if (yq.split(" ")[0].equals("2")){
                System.out.println();
                int count=0;
                int sum=0;
                for(int j=0;j<N;j++){
                    String kh=stu[j].split(" ")[0];//考号
                    StringBuilder sbkc=new StringBuilder();//用于保存考场号
                    //获取考场号
                    for (int l=1;l<4;l++){
                        sbkc.append(kh.split("")[l]);
                    }
                    //根据考场号判断获取数据
                    if (sbkc.toString().equals(yq.split(" ")[1])){
                        count++;
                        sum+=Integer.parseInt(stu[j].split(" ")[1]);
                    }
                }
                //输出
                System.out.println("Case " + (i + 1) + ": " + yq);
                if(count!=0) {
                    System.out.print(count + " " + sum);
                }else {
                    System.out.print("NA");
                }
            }
            //条件3
            else if (yq.split(" ")[0].equals("3")){
                System.out.println();
                int[] x=new int[1000];//存放序号对应考场的数量
                int count=0;
                for(int l=0;l<1000;l++){
                    x[l]=0;
                }
                for(int j=0;j<N;j++) {
                    String kh = stu[j].split(" ")[0];//考号
                    StringBuilder sbkc = new StringBuilder();//用于保存考场号
                    StringBuilder rq=new StringBuilder();//保存日期
                    for (int l=1;l<4;l++){//编号
                        sbkc.append(kh.split("")[l]);
                    }
                    for (int l=4;l<10;l++){//日期
                        rq.append(kh.split("")[l]);
                    }
                    if(rq.toString().equals(yq.split(" ")[1])){//满足日期
                        x[Integer.parseInt(sbkc.toString())]++;
                    }
                }
                for(int j=0;j<1000;j++){
                    if(x[j]!=0){
                        count++;
                    }
                }
                int[][] result=new int[count][2];
                int d=0;
                for(int j=0;j<1000;j++){
                    if(x[j]!=0){
                        result[d][0]=j;
                        result[d][1]=x[j];
                        d++;
                    }
                }
                //有点迷糊就直接冒泡排序解决了
                for(int j=0;j<count;j++){
                    for(int l=1;l<count-j;l++){
                        if(result[l][1]>result[l-1][1]){
                            int temp=result[l][1];
                            int temp1=result[l][0];
                            result[l][1]=result[l-1][1];
                            result[l][0]=result[l-1][0];
                            result[l-1][1]=temp;
                            result[l-1][0]=temp1;
                        }
                    }
                }
                //结果
                System.out.println("Case "+(i+1)+": "+yq);
                for (int j=0;j<count-1;j++){
                    System.out.println(result[j][0]+" "+result[j][1]);
                }
                System.out.print(result[count-1][0]+" "+result[count-1][1]);//为了输出没有多余换行//好像还是避免不了最后一个换行..
            }
        }
    }
}
