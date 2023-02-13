package myapp.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // new 해주는 메서드.
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/metadb", "root", "1234");
            System.out.println("db연결 성공");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        DBConn.getConnection();
    }
}
