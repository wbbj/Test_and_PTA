package Test_PTA_1001to1061;
import java.util.Scanner;

public class PTA1049 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (i + 1) * a[i] * (n - i);
        }

        System.out.printf("%.2f", sum);
    }
}
