package Test_PTA_1062to1095;

import Test_PcImage.M;
import sun.reflect.generics.tree.Tree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PTA1087 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();

        Set<Integer> sum=new TreeSet<>();
        for(int i=1;i<=N;i++){
            int h=0;
            h= (int)Math.floor(i/2)+(int)Math.floor(i/3)+(int)Math.floor(i/5);
            sum.add(h);
        }
        System.out.println(sum.size());
    }
}
