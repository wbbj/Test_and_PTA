package Test_Pc_File_json;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PcJson {
    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("/myFile/json.json"), StandardCharsets.UTF_8));
        //StringBuilder us =new StringBuilder();
        //String data="";
        //while ((data = br.readLine()) != null) {
         //   us.append(data);
        //}
        String s=null;
        String us="";
        while ((s=br.readLine())!=null){
            us=new String(s.getBytes("UTF-8"),"UTF-8");

        }
        System.out.println(us);
        System.out.println();
        JSONObject jo=new JSONObject(us);
        System.out.println(jo);
        JSONObject da=jo.getJSONObject("data");
        System.out.println(da);
        JSONArray sr=da.getJSONArray("searchResult");
        System.out.println(sr);
        Connection con=Ct.getCt();
        Statement sta=con.createStatement();
        for(int i=0;i<sr.length();i++){
            String[] srx=new String[11];
            JSONObject jb=sr.getJSONObject(i);
            srx[0]=jb.getLong("id")+"";
            srx[1]=jb.getString("imageUrl");
            srx[2]=jb.getString("title");
            srx[3]=jb.getString("address");
            srx[5]=jb.getLong("lowestprice")+"";
            srx[6]=jb.getLong("avgprice")+"";
            srx[7]=jb.getLong("avgscore")+"";
            srx[8]=jb.getString("backCateName");
            srx[9]=jb.getString("areaname");
            srx[10]=jb.getString("city");
            String sql0="insert into film values(" +
                    srx[0] +
                    ",'" +
                    srx[1] +
                    "','" +
                    srx[2] +
                    "','" +
                    srx[3] +
                    "'," +
                    srx[4] +
                    "," +
                    srx[5] +
                    "," +
                    srx[6] +
                    ",'" +
                    srx[7] +
                    "','" +
                    srx[8] +
                    "','" +
                    srx[9] +
                    "')";
            JSONArray yh=jb.getJSONArray("deals");
            for(int j=0;j<yh.length();j++){
                JSONObject de=yh.getJSONObject(j);
                String[] deals=new String[5];
                deals[0]=de.getLong("id")+"";
                deals[1]=de.getString("title");
                deals[2]=de.getLong("price")+"";
                deals[3]=de.getLong("value")+"";
                deals[4]=de.getLong("sales")+"";
                String sql1="insert into deals values(" +
                        deals[0] +
                        ",'" +
                        deals[1] +
                        "'," +
                        deals[2] +
                        "," +
                        deals[3] +
                        "," +
                        deals[4] +
                        ")";
                sta.execute(sql1);
            }sta.execute(sql0);
        }



    }

}
