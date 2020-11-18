package cz3002.group43.models;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import cz3002.group43.actions.LoginAction;


public class UserModel extends ActionSupport {

    private String user;
    private String password;
    private static final Logger LOG = LoggerFactory.getLogger(LoginAction.class);
    private final String dbUserName;
    private final String dbPassword;

    public UserModel() {

        String resourceName = "database.properties"; // could also be a constant
        ClassLoader loader = getClass().getClassLoader();
        Properties props = new Properties();
        try(InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
            props.load(resourceStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.dbUserName = System.getProperty("USERNAME", "root");
        this.dbPassword = System.getProperty("PASSWORD", "");

    }

    public String execute() {
        String ret = ERROR;
        Connection conn = null;

        try {
            String URL = "jdbc:mysql://127.0.0.1:3306/cz3002?useTimezone=true&serverTimezone=GMT%2B8";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, dbUserName, dbPassword);
            LOG.info("Connection with database has been established successfully!");
            String sql = "SELECT user FROM user_table WHERE user = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString(1);
                LOG.info(String.format("%s has logged in successfully!", name));
                ret = SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
            ret = ERROR;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
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

}
