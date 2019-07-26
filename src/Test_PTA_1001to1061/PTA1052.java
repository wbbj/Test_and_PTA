package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PTA1052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] hand=br.readLine().split("[\\[\\] ]");
        String[] eye=br.readLine().split("[\\[\\] ]");
        String[] mouth=br.readLine().split("[\\[\\] ]");

        hand=removeEmpty(hand);
        eye=removeEmpty(eye);
        mouth=removeEmpty(mouth);

        int N=Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String [] k=br.readLine().split("\\s+");
            if(Integer.parseInt(k[0])<=0||Integer.parseInt(k[0])>hand.length||Integer.parseInt(k[1])<=0||Integer.parseInt(k[1])>eye.length||Integer.parseInt(k[2])<=0||Integer.parseInt(k[2])>mouth.length||
                    Integer.parseInt(k[3])<=0||Integer.parseInt(k[3])>eye.length||Integer.parseInt(k[4])<=0||Integer.parseInt(k[4])>hand.length){
                System.out.println("Are you kidding me? @\\/@");
            }
            else {
                System.out.println(hand[Integer.parseInt(k[0])-1]+"("+eye[Integer.parseInt(k[1])-1]+mouth[Integer.parseInt(k[2])-1]+eye[Integer.parseInt(k[3])-1]+")"+hand[Integer.parseInt(k[4])-1]);
            }
        }
    }
    private static String[] removeEmpty(String[] string) {
        //定义一个list列表，并循环赋值
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(string));
        //删除list列表中所有的空值
        while (strList.remove(null));
        while (strList.remove(""));
        //把list列表转换给一个新定义的中间数组，并赋值给它
        return strList.toArray(new String[0]);
    }
}
