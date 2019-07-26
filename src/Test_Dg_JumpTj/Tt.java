package Test_Dg_JumpTj;

public class Tt {
    public static int t(int n){
        if (n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }else {
            return t(n-1)+t(n-2);
        }
    }
}
