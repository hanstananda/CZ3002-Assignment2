package cz3002.group43.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

public class LoginAction extends ActionSupport {

    private static final Logger LOG = LoggerFactory.getLogger(LoginAction.class);
    private String username;
    private String password;


    @RequiredStringValidator(message = "Please enter a username", trim = true) public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    @RequiredStringValidator(message = "Please enter a password", trim = true) public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String execute() throws Exception {
        LOG.info("Logging in...");
        if(checkLogin(this.username, this.password)) {
            return SUCCESS;
        }
        return ERROR;
    }

    private static boolean checkLogin(String username,String password) {
        return username.equals("test") && password.equals("test");
    }

}
