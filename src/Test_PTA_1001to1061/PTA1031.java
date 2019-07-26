package Test_PTA_1001to1061;

import java.util.Scanner;

public class PTA1031 {
    public static char[] base = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
    public static int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();
        scanner.nextLine();
        boolean tag = true;
        String[] m=new String[n];
        int t=0;
        for (int i = 0; i < n; i++) {
            String eachString = scanner.nextLine();
            if (!getLegal(eachString)) {
                m[t]=eachString;
                t=t+1;
                tag = false;
            }
        }
        if (tag) {
            System.out.println("All passed");
        }
        for(int i=0;i<m.length;i++) {
            System.out.println(m[i]);
        }
    }

    public static boolean getLegal(String stringItem) {
        int sum = 0;
        for (int i = 0; i < 17; ++i) {
            if (stringItem.charAt(i) < '0' || stringItem.charAt(i) > '9') {
                return false;
            }
            sum = sum + (stringItem.charAt(i) - '0') * weight[i];
        }
        int mod = sum % 11;
        if (base[mod] != stringItem.charAt(17)) {
            return false;
        }
        return true;
    }
}
