package Test_Pc_Url_json;

import java.io.IOException;
import java.net.URL;
import java.net.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class m {
    public static void main(String[] args) throws SQLException, IOException {
            URL url = new URL("https://sh.meituan.com/ptapi/recommends?limit=10");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (iPad; CPU OS 11_0 like Mac OS X) AppleWebKit/604.1.34 " +
                    "(KHTML, like Gecko) Version/11.0 Mobile/15A5341f Safari/604.1");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;
            while ((current = in.readLine()) != null) {
                urlString+= current;
            }
            JSONArray json = JSONArray.fromObject(urlString);//大括号object 字符串string 数组list

            Connection con = Conn.getConn();
            Statement sta = con.createStatement();
            for (int i = 0; i < json.size(); i++) {
                String[] m = new String[json.size()];
                JSONObject jsonObject = json.getJSONObject(i);
                System.out.println(jsonObject);
                m[0] = jsonObject.getString("itemId");
                m[1] = jsonObject.getString("title");
                m[2] = jsonObject.getString("imgUrl");
                m[3] = jsonObject.getString("score");
                m[4] = jsonObject.getString("areaName");
                m[5] = jsonObject.getString("lowPrice");
                m[6] = jsonObject.getString("avgPrice");
                m[7] = jsonObject.getString("commentNum");
                String sql = "insert into dianpu values(" +
                        m[0] +
                        ",'" +
                        m[1] +
                        "','" +
                        m[2] +
                        "'," +
                        m[3] +
                        ",'" +
                        m[4] +
                        "'," +
                        m[5] +
                        "," +
                        m[6] +
                        "," +
                        m[7] +
                        ")";
                sta.execute(sql);
            }
    }

}


