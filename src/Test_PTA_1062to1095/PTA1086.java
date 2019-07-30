package Test_PTA_1062to1095;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class PTA1086 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int A=in.nextInt();
        int B=in.nextInt();
        String  C;
        C=A*B+"";

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list, C.split(""));
        reverse(list);

        int result=Integer.parseInt(String.join("",list));

        System.out.println(result);
    }
}
