package cz3002.group43.actions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionSupport;


public class SQLTesting {
    private static String user;
    private  static String password;
    private static String name;

    public static String execute() {
        String ret = "ERROR";
        Connection conn = null;

        try {
            String URL = "jdbc:mysql://127.0.0.1:3306/cz3002";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "");
            String sql = "SELECT name FROM user_table WHERE";
            sql+=" user = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name = rs.getString(1);
                ret = "SUCCESS";
            }
        } catch (Exception e) {
            ret = "ERROR";
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }
        return ret;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        user = "FARHAN";
        password = "FARHAN";
        System.out.println(execute());
    }
}
