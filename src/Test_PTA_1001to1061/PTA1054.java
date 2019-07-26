package Test_PTA_1001to1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] number = br.readLine().split(" ");
        double sum = 0;
        double counts = 0;
        for (int i = 0; i < n; i++) {
            try {//通过捕捉异常的方式判断是否合法,如果能转为double型就无异常,不能则抛出异常
                double x = Double.parseDouble(number[i]);
                int cha = 0;
                //获取小数点后的位数从而判断是否合法
                if (number[i].contains(".")) {
                    cha = number[i].length() - number[i].indexOf(".") - 1;
                }
                if (x >= -1000 && x <= 1000 && cha <= 2 && cha >= 0) {
                    sum += x;
                    counts++;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.printf("ERROR: %s is not a legal number\n", number[i]);
            }
        }
        if (counts == 0) {
            System.out.printf("The average of %.0f numbers is Undefined", counts);
        } else{
            System.out.printf("The average of %.0f number is %.2f\n", counts, sum / counts);
        }

    }
}