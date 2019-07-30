package Test_PTA_1062to1095;

import java.util.Scanner;
import java.util.Vector;

public class PTA1089 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] nums=new int[N+1];
        for(int i=1;i<N+1;i++){
            nums[i]=in.nextInt();
        }
        int count=0;
        int wolf1, wolf2;
        loop:for(wolf1 = 1; wolf1 <= N; wolf1++) {
            for (wolf2 = wolf1 + 1; wolf2 <= N; wolf2++) {
                Vector<Integer> lie = new Vector<>();
                for (int i = 1; i < N + 1; i++) {
                    if (nums[i] < 0 && -nums[i] != wolf1 && -nums[i] != wolf2) {
                        lie.add(i);
                    } else if (nums[i] > 0 && (nums[i] == wolf1 || nums[i] == wolf2)) {
                        lie.add(i);
                    }
                }
                if (lie.size() == 2) {
                    if (lie.get(0) == wolf1 || lie.get(0) == wolf2) {
                        if (lie.get(1) != wolf1 && lie.get(1) != wolf2) {
                            System.out.printf("%d %d\n", wolf1, wolf2);
                            break loop;

                        }
                    } else if (lie.get(1) == wolf1 || lie.get(1) == wolf2) {
                        if (lie.get(0) != wolf1 && lie.get(0) != wolf2) {
                            System.out.printf("%d %d\n", wolf1, wolf2);
                            break loop;

                        }
                    }
                }
                count++;
            }
        }
        if(count==2*N)
        {
            System.out.println("No Solution");
        }
    }
}
