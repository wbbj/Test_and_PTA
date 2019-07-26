package Test_PTA_1062to;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PTA1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] m = br.readLine().split(" ");//存放输入的数字
//        TreeSet<Integer> p = new TreeSet<>();//存放朋友证号
//        for (int i = 0; i < N; i++) {
//            int d = 0;
//            String[] t = m[i].split("");
//            for (String s : t) {
//                d += Integer.parseInt(s);
//            }
//            p.add(d);
//        }
//        System.out.println(p.size());
//        int a = p.pollLast();
//        for (int i : p) {
//            System.out.print(i + " ");
//        }
//        System.out.print(a);
        //下面是我一开始的想法
        int[] p=new int[N];
        for (int i=0;i<N;i++){
            String[] t=m[i].split("");
            for (String s : t) {
                p[i]+= Integer.parseInt(s);
            }
        }
        Arrays.sort(p);
        Object[] r = remove(p);
        for(int i=0;i<r.length-1;i++){
            System.out.print(r[i]+" ");
        }
        System.out.println(r[r.length-1]);
    }
    private static Object[] remove(int[] arr){
        //创建一个集合
        List<Object> list = new ArrayList<>();
        //遍历数组往集合里存元素
        for (Object o : arr) {
            //如果集合里面没有相同的元素才往里存
            if (!list.contains(o)) {
                list.add(o);
            }
        }
        //toArray()方法会返回一个包含集合所有元素的Object类型数组
        return list.toArray();
    }

}
