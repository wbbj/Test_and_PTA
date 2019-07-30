package Test_Ahsf;

import java.util.Scanner;

public class Fast_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        fastsort(a,0,N-1);
        for(int i=0;i<N;i++){
            System.out.print(a[i]+" ");
        }
    }
    private static void fastsort(int[] a,int left, int right){
        int i,j,t,temp;
        if(left>right){
            return;
        }
        temp=a[left];
        i=left;
        j=right;

        while (i!=j){
            while (a[j]>=temp&&i<j){
                j--;
            }
            while (a[i]<=temp&&i<j){
                i++;
            }
            if(i<j){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        a[left]=a[i];
        a[i]=temp;
        fastsort(a,left,i-1);
        fastsort(a,i+1,right);
    }
}
