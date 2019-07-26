package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int time = ((b - a) +50) / 100;

        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int seconds = time % 60;
        System.out.printf("%02d:%02d:%02d\n",hour,minute,seconds);
    }
}