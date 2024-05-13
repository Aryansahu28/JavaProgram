import java.sql.*;
public class jdbcconn{
    public static void main(String arg[]) throws Exception{
        String sql = "SELECT firstname from student_info where id = 124";
        String url = "jdbc:postgresql://localhost/JDBC_connection";
        String username = "postgres";
        String password = "Aryansahu@28";
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        rst.next();
        String name = rst.getString(1);
        System.out.println(name);
        
    }
}