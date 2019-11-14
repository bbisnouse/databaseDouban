package dbc;

import java.sql.*;

public class demo {
	
    public static void main(String[] args) {
        String user = "sa";
        String password = "123";
        Connection conn;
        Statement stmt;
        ResultSet rs;
        String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Douban;";
        String sql = "select * from movie";
        try {
            // 连接数据库
            conn = DriverManager.getConnection(url, user, password);
            // 建立Statement对象
            stmt = conn.createStatement();
            // 执行数据库查询语句
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("Movie_id");
                String name = rs.getString("Movie_name");
                String con = rs.getString("Country");
                String lan = rs.getString("Language");
                String date = rs.getString("Release_date");
                String time = rs.getString("Time");
                String imdb = rs.getString("IMdB");
                String syn = rs.getString("Synopsis");
                String img = rs.getString("Movie_Image");
                System.out.println("证件号 "+id+" 电影名 "+name);
            }
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
