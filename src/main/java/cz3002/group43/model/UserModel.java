package cz3002.group43.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;


public class UserModel extends ActionSupport {

    private String user;
    private String password;
    private String name;

    public String execute() {
        String ret = ERROR;
        Connection conn = null;

        try {
            String URL = "jdbc:mysql://127.0.0.1:3306/cz3002?useTimezone=true&serverTimezone=GMT%2B8";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "");
            System.out.println("Get inside DB");
            String sql = "SELECT name FROM user_table WHERE";
            sql+=" user = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println(name);
                ret = SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
            ret = ERROR;
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
}
