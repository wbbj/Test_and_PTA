package Test_jdbc;

import java.sql.*;

public class HandleSql { //创建 HandleSql 类

    private static Connection con; //声明 Connection 对象
    private static PreparedStatement pStmt;//声明预处理 PreparedStatement 对象

    private Connection getConnection() {//建立返回值为 Connection 的方法

        //加载数据库驱动类
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //通过访问数据库的URL获取数据库连接对象
        try {
            String url = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC&characterEncoding=GBK&useUnicode=true&useSSL=false";
            String password = "367494";
            String user = "root";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
    public static void main(String[] args) {//主方法
        HandleSql h = new HandleSql();//创建本类对象
        con = h.getConnection();//与数据库建立连接
        addData();
        updateData();
        deleteData();
        queryData();
    }

    //创建查询数据方法
    private static void queryData() {
        try {
            pStmt=con.prepareStatement("select * from student");
            //声明结果 ResultSet 对象
            ResultSet res = pStmt.executeQuery();
            while (res.next()) {//如果当前语句不是最后一条，则进入循环
                int id = res.getInt("id");
                String name = res.getString("name");
                String phone = res.getString("bianhao");
                System.out.println("id：" + id + "  " + "姓名：" + name + "  " + "电话：" + phone);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addData() {
        try {
            pStmt = con.prepareStatement("insert into student (name,bianhao) values(?,?)");
            pStmt.setString(1, "lisi");
            pStmt.setString(2, "1234567");
            pStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateData() {
        try {
            pStmt = con.prepareStatement("update student set name = ? where id = 6");
            pStmt.setString(1, "wangba");
            pStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteData() {
        try {
            Statement stmt = con.createStatement();//创建Statement对象
            stmt.executeUpdate("delete from student where id=4");
            stmt.executeUpdate("delete from student where id=7");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}