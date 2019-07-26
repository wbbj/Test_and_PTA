package Test_YsfCircle;

import java.util.LinkedList;

public class Li {
    public static void ysfh(int num){
        LinkedList<Integer> link=new LinkedList<>();
        for (int i = 1; i <=num; i++)link.add(i);
        int i=0;
        while (num>1){
            i=(i+3)%link.size();
            link.remove(i);
            num--;
            for(int m=0;m<link.size();m++){
                System.out.print(link.get(m)+" ");
            }
            System.out.println();
        }
        System.out.println("最终剩下:"+link.peek());
    }
}
