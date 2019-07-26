package Test_LinkedList;

public class Link {
    private Node head;
    public void create(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        head=node;
    }
    public int gethead(){

        return this.head.data;
    }
    public void add(int m){
        Node n=new Node();
        Node c;
        n.data=m;
        c=head;
        while (c.next!=null){
            c=c.next;
        }
        n.next=null;
        c.next=n;
    }
    public int getsize(){
        int size=0;
        Node m;
        m=head;
        while (m!=null){
            m=m.next;
            size++;
        }
        return size;
    }
    public void delete(int i){
        Node n;
        n=head;
        if(i<this.getsize()) {
            for (int j = 1; j < i - 1; j++) {
                n = n.next;
            }
            n.next=n.next.next;
        }
        if(i==this.getsize()){
            n.next=null;
        }
        else {
            System.out.println("超出范围");
        }
    }
    public void list(){
        Node l;
        l=head;
        System.out.print("链表: ");
        for(int i=1;i<=this.getsize();i++){
            System.out.print(l.data+" ");
            l=l.next;
        }
        System.out.println();
    }
    public void insert(int i,int m){
        Node t=new Node();
        t.data=m;
        Node s;
        s=head;
        if(i<this.getsize()) {
            for (int j = 1; j < i; j++) {
                s = s.next;
            }
            t.next = s.next;
            s.next = t;
        }
        if(i==this.getsize()){
            for (int j = 1; j < i; j++) {
                s = s.next;
            }
            s.next=t;
            t.next=null;
        }
        else {
            System.out.println("超出范围");
        }
    }
    public void replace(int i,int r){
        Node t=new Node();
        t.data=r;
        Node s;
        s=head;
        if(i<this.getsize()) {
            for (int j = 1; j < i-1; j++) {
                s=s.next;
            }
            t.next=s.next.next;
            s.next=t;
        }
        if(i==this.getsize()){
            for (int j = 1; j < i-1; j++) {
                s=s.next;
            }
            s.next=null;
        }
        else {
            System.out.println("超出范围");
        }
    }
}
