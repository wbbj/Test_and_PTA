package Test_PTA_1001to1061;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PTA1022 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        Long a = Long.parseLong(in[0]);
        Long b = Long.parseLong(in[1]);
        Integer d = Integer.parseInt(in[2]);
        System.out.println(Long.toString(a + b, d));
    }

}