package Test_PTA_1001to1061;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class PTA1028 {
    //使用java中的SimpleDateFormat类用来对日期字符串进行解析和格式化输出
    private final static DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

    //
    static class Person implements Comparable<Person> {
        String name;
        private Date brithday;

        Person(String name, Date birthday) {
            this.name = name;
            this.brithday = birthday;
        }

        @Override
        public int compareTo(Person p) {
            return this.brithday.compareTo(p.brithday);//比较两个日期
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //parse
        //public Date parse(String texts)
        //解析字符串的文本，生成 Date。
        //此方法试图解析文本。如果解析成功，并返回解析得到的日期。
        Date max = df.parse("2014/09/06");//最晚出生时间
        Date min = df.parse("1814/09/06");//最早出生时间
        int n = Integer.parseInt(br.readLine());//读取输入的人数
        List<Person> list = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            String[] people = br.readLine().split(" ");//以空格划分输入的数据
            String name = people[0];//姓名
            Date date = df.parse(people[1]);//日期
            if (date.compareTo(max) <= 0 && date.compareTo(min) >= 0) {//比较日期判断是否在要求的区间内
                list.add(new Person(name, date));
            }
        }
        if (list.size() > 0) {
            Collections.sort(list);//使用Collections工具类的sort静态方法对list进行排序
            System.out.print(list.size() + " " + list.get(0).name + " "
                    + list.get(list.size() - 1).name);
        } else {
            System.out.println(0);
        }
    }
}
