package Test_MyArryList;

public class Main {
    public static void main(String[] args) {
        MyArrayList array=new MyArrayList();
        int m=0;
        array.setSize(20);
        System.out.println("数组容量设置为"+array.getRl());
        for (int i=0;i<10;i++) {
            array.setMyArrayLists(i,i);
        }
        System.out.println("设置数组内部分元素");
        for(int i=0;i<array.getSize();i++){
            System.out.print(array.getMyArrayLists(i)+" ");
        }
        System.out.println();
        array.insert(2,8);
        array.insert(4,9);
        array.delete(5);
        System.out.println("插入和删除操作在第二个元素后面插入8，第四个元素后面插入9然后删除低5个元素，并获取元素数量");
        m=array.getSize();
        System.out.println(m);
        for(int i=0;i<array.getSize();i++){
            System.out.print(array.getMyArrayLists(i)+" ");
        }
        System.out.println();
        System.out.println("将数组填满");
        for (int i=0;i<9;i++){
            array.insert(i+1,15);
        }

        m=array.getSize();
        System.out.println(m);
        for(int i=0;i<array.getSize();i++){
            System.out.print(array.getMyArrayLists(i)+" ");
        }
        System.out.println();
        System.out.println("再插入一个元素");
        array.insert(3,6);
        m=array.getSize();
        System.out.println(m);
        for(int i=0;i<array.getSize();i++){
            System.out.print(array.getMyArrayLists(i)+" ");
        }
        System.out.println();
        array.reSize();
        System.out.println("容量扩充1.5倍");
        System.out.println("数组容量:"+array.getRl());
        for(int i=0;i<array.getSize();i++){
            System.out.print(array.getMyArrayLists(i)+" ");
        }
        System.out.println();
    }
}
