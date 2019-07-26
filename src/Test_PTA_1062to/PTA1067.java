package Test_PTA_1062to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTA1067 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] read=br.readLine().split(" ");
        int N=Integer.parseInt(read[1]);
        int i=1;
        int count=0;
        while (i<=N){
            String re=br.readLine();
            if(re.equals("#")){
                break;
            }else if(!re.equals(read[0])){
                System.out.println("Wrong password: "+re);
                count++;
            }else {
                System.out.println("Welcome in");
                break;
            }
            i++;
        }
        br.close();
        if(count==N){
            System.out.println("Account locked");
        }
    }
}
