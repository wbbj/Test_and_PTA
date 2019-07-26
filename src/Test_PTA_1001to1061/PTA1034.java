package Test_PTA_1001to1061;

import java.io.*;

public class PTA1034 {
    private static long gcd(long a,long b) {//辗转相除法
        return b == 0 ? a : gcd(b , a % b);
    }
    private static String calculate(long a,long b) {//先化简两个分数
        if(b == 0) {
            return "Inf";
        }
        long gcd,t,x;
        gcd = gcd(Math.abs(a), b);  //最大公约数，Math.abs(x)返回x的绝对值
        a = a / gcd;
        b = b / gcd;
        t = Math.abs(a) / b;    //整数
        x = Math.abs(a) - t * b;//分子
        if(t == 0 && x == 0) {
            return "0";
        }
        if(a < 0) {
            if(t != 0 && x != 0)
                return "(-"+t+" "+x+"/"+b+")";
            if(t != 0 && x == 0)
                return "(-"+t+")";
            if(t == 0 && x != 0)
                return "(-"+x+"/"+b+")";
        } else {
            if (t != 0 && x != 0)
                return t+" "+x+"/"+b;
            if(t != 0 && x == 0)
                return String.valueOf(t);
            if(t == 0 && x != 0)
                return x+"/"+b;
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] y = in.readLine().split(" ");
        String[] a = y[0].split("/"), b = y[1].split("/");
        long a1 = Long.parseLong(a[0]), a2 = Long.parseLong(b[0]);
        long b1 = Long.parseLong(a[1]), b2 = Long.parseLong(b[1]);
        String A,B;
        A = calculate(a1,b1);
        B = calculate(a2,b2);

        out.println(A + " + " + B + " = " + calculate(a1*b2+a2*b1,b1*b2));
        out.flush();
        out.println(A + " - " + B + " = " + calculate(a1*b2-a2*b1,b1*b2));
        out.flush();
        out.println(A + " * " + B + " = " + calculate(a1*a2,b1*b2));
        out.flush();
        out.print(A + " / " + B + " = ");
        out.flush();
        if(a2 < 0) {
            out.print(calculate(a1 * b2 * a2 / Math.abs(a2) , b1 * Math.abs(a2)));
        } else {
            out.print(calculate(a1 * b2 , b1 * a2));
        }
        out.flush();
    }
}