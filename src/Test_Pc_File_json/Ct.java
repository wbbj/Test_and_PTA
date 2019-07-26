package Test_Pc_File_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ct {

    public static Connection getCt() {

        String url = "jdbc:mysql://localhost:3306/dianpu?serverTimezone=UTC&characterEncoding=utf-8&useUnicode=true&useSSL=false";
        String username = "root";
        String password = "367494";
        String driver = "com.mysql.jdbc.Driver";
        Connection conn = null;
        try {
            Class.forName(driver);
            System.out.println("数据库驱动加载成功");
            conn =DriverManager.getConnection(url, username, password);
            System.out.println("数据库连接成功");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
