package Test_DoubleLink;

public class DoubleLink {
    private Node head;
    public void create(int data,int data1){
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.previous=null;
        head=node;
    }
    public int gethead(){

        return this.head.data;
    }
    public int getsize(){
        Node t;
        t=head;
        int size=0;
        while (t!=null){
            t=t.next;
            size++;
        }
        return size;
    }
    public void add(int a){
        Node t=new Node();
        Node s;
        t.data=a;
        s=head;
        while (s.next!=null){
            s=s.next;
        }
        t.next=null;
        t.previous=s;
        s.next=t;

    }
    public void list(){
        Node s;
        s=head;
        System.out.print("链表: ");
        for(int i=1;i<=this.getsize();i++){
            System.out.print(s.data+" ");
            s=s.next;
        }
        System.out.println();
        System.out.println(s.next.next.data);
    }
    public void insert(int i,int data){
        Node in=new Node();
        Node s;
        in.data=data;
        s=head;
        if(i<=this.getsize()) {
            for (int j = 1; j <i; j++) {
               s=s.next;
            }
            in.next=s.next;
            s.next.previous=in;
            s.next=in;
            in.previous=s;
        }else {
            System.out.println("超出范围");
        }
    }
    public void delete(int i){
        Node n;
        n=head;
        if(i<this.getsize()) {
            for (int j = 1; j < i - 1; j++) {
                n = n.next;
            }
            n.next=n.next.next;
            n.next.next.previous=n;
        }else {
            System.out.println("超出范围");
        }
    }
    public void replace(int i,int r){
        Node t=new Node();
        t.data=r;
        Node s;
        s=head;
        if(i<=this.getsize()) {
            for (int j = 1; j < i-1; j++) {
                s=s.next;
            }
            t.next=s.next.next;
            t.previous=s;
            s.next=t;
        }else {
            System.out.println("超出范围");
        }
    }
}
