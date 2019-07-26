package Test_Pc_Url_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conn {

    public static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dianpu?serverTimezone=UTC&characterEncoding=utf-8&useUnicode=true&useSSL=false";
        String username = "root";
        String password = "367494";
        Connection conn = null;
        try {
            Class.forName(driver); //
            conn =DriverManager.getConnection(url, username, password);

            System.out.println("数据库连接成功");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
