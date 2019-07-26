package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1035 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=in.nextInt();
        }
        for(int i=0;i<(int)Math.floor(n/2);i++){
            int currenta = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > currenta) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = currenta;
        }
        int t=0;
            while (a[t]==b[t]&&t<(int)Math.floor(n/2)){
                t=t+1;
            }
            if(t==(int)Math.floor(n/2)) {
                System.out.println("Insertion Sort");
            }
        int currenta=a[(int) Math.floor(n/2)];
        int j= (int) (Math.floor(n/2)-1);
        while (j>=0&&a[j]>currenta){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=currenta;
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }
    }
}
