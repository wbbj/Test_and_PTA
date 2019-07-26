package Test_PTA_1062to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class PTA1068 {
    private static int[][] dir = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
    private static int[][] screen = new int[1001][1001];
    private static int tol;
    private static int n;
    private static int m;
    private static boolean judge(int i, int j) {
        for (int k = 0; k < 8; k++) {
            int tx = i + dir[k][0];
            int ty = j + dir[k][1];
            if (tx >= 0 && tx < n && ty >= 0 && ty < m && screen[i][j] - screen[tx][ty] >= 0 - tol && screen[i][j] - screen[tx][ty] <= tol) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0, x = 0, y = 0;
        String[] s = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        tol = Integer.parseInt(s[2]);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] sp = br.readLine().split("\\s+|\t");
            for(int j = 0; j < m; j++) {
                screen[i][j] = Integer.parseInt(sp[j]);
                if(map.containsKey(screen[i][j]))
                    map.put(screen[i][j], map.get(screen[i][j]) + 1);
                else
                    map.put(screen[i][j], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map.get(screen[i][j]) == 1 && judge(i, j)) {
                    cnt++;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        if (cnt == 1)
            System.out.printf("(%d, %d): %d", y, x, screen[x-1][y-1]);
        else if (cnt == 0)
            System.out.print("Not Exist");
        else
            System.out.print("Not Unique");
    }
}
