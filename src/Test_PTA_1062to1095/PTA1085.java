package Test_PTA_1062to1095;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PTA1085 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        String[] input = new String[num];
        School[] school = new School[10000];
        int count = 0;// 学校的个数

        for (int i = 0; i < 1000; i++)
            school[i] = new School();

        for (int i = 0; i < num; i++) {
            input[i] = in.readLine();
        }
        in.close();

        for (int i = 0; i < num; i++) {
            boolean schoolhas = false;
            String[] value = input[i].split(" ");
            char rate = value[0].charAt(0);// 考试等级
            Loop: for (int j = 0; j < count; j++) {//标记此循环
                if (value[2].equalsIgnoreCase(school[j].Name)) {
                    schoolhas = true;
                    switch (rate) {
                        case 'B':
                            school[j].score += Integer.parseInt(value[1]) * 2 / 3;//乙级的分数
                            school[j].studentNum++;
                            break Loop;//跳出标记的循环
                        case 'A':
                            school[j].score += Integer.parseInt(value[1]);//甲级的分数
                            school[j].studentNum++;
                            break Loop;
                        default:
                            school[j].score += Integer.parseInt(value[1]) * 3 / 2;//顶级的分数
                            school[j].studentNum++;
                            break Loop;
                    }
                }
            }
            if (!schoolhas) {
                school[count].Name = value[2].toLowerCase();//转成小写
                switch (rate) {
                    case 'B':
                        school[count].score += Integer.parseInt(value[1]) * 2 / 3;
                        school[count].studentNum++;
                        school[count].a = rate;
                        break;
                    case 'A':
                        school[count].score += Integer.parseInt(value[1]);
                        school[count].studentNum++;
                        school[count].a = rate;
                        break;
                    default:
                        school[count].score += Integer.parseInt(value[1]) * 3 / 2;
                        school[count].studentNum++;
                        school[count].a = rate;
                        break;
                }
                count++;
            }
        }
        //加入TreeSet并排序
        Set<School> set = new TreeSet<>(Arrays.asList(school).subList(0, count));
        int order =1;
        int temp =0;
        int score =0;
        System.out.println(count);
        for (School school2 :set) {
            if(score==school2.score)
                System.out.print(temp);
            else {
                System.out.print(order);
                temp=order;//保存上一位的排名
            }
            System.out.println(" " + school2.Name + " " + school2.score + " " + school2.studentNum);
            score = school2.score;//保存上一个人的分数
            order++;//前面的人数
        }
    }
}

class School implements Comparable<School> {
    String Name;
    int score;
    int studentNum;
    char a;

    @Override
    public int compareTo(School o) {
        //按照分数排序
        int result = this.score - o.score;
        if (result != 0)
            return -result;
        else {//按照学生个数排序
            result = this.studentNum - o.studentNum;
            if (result != 0)
                return result;
            else {//按字典码排序，既每个字符串依次按照ASCll表排序，小的在前，都相同就按照长度排
                result = this.Name.compareTo(o.Name);
                return result;
            }
        }
    }
}
