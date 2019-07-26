package Test_LinkedList;

public class Test {
    public static void main(String[] args) {
        Link link=new Link();
        link.create(1);
        int m=0;
        int n=link.gethead();
        System.out.println("头结点为:"+n);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        m=link.getsize();
        System.out.println("链表长度为:"+m);
        link.delete(3);
        System.out.println("删除第三个节点");
        link.list();
        m=link.getsize();
        System.out.println("链表长度为:"+m);
        link.add(6);
        link.add(7);
        link.delete(5);
        System.out.println("先在末尾添加6和7，然后删除第五个节点");
        link.list();
        link.insert(2,10);
        System.out.println("在第二个节点后插入10");
        link.list();
        link.replace(3,2);
        System.out.println("替换第三个节点为2");
        link.list();
    }
}

