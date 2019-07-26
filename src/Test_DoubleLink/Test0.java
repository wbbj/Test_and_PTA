package Test_DoubleLink;

public class Test0 {
    public static void main(String[] args) {
        DoubleLink doubleLink=new DoubleLink();
        doubleLink.create(1,2);
        int n=doubleLink.gethead();
        int size=0;
        System.out.println("头结点为:"+n);
        doubleLink.add(3);
        doubleLink.add(4);
        doubleLink.add(5);
        size=doubleLink.getsize();
        System.out.println("链表的size:"+size);
        doubleLink.list();
        doubleLink.insert(3,7);
        System.out.println("在第三个位置添加7");
        doubleLink.list();
        doubleLink.delete(3);
        System.out.println("删除第三个位置");
        doubleLink.list();
        doubleLink.replace(2,8);
        System.out.println("替换第二个位置为8");
        doubleLink.list();
    }
}
