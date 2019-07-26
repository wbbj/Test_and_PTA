package test;

public class S {
    public static void Buffer(){
        long s=System.currentTimeMillis();
        StringBuffer t=new StringBuffer();
        for(int i=1;i<10000000;i++){
            t.append(i);
        }
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }
    public static void Builder(){
        long s=System.currentTimeMillis();
        StringBuilder m=new StringBuilder();
        for(int i=1;i<10000000;i++){
            m.append(i);
        }
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }
    public static void main(String[] args){
        S.Builder();
        S.Buffer();
    }
}
