package cz3002.group43;
import com.opensymphony.xwork2.Action;
import cz3002.group43.models.UserModel;
import cz3002.group43.utils.PasswordHasher;
import junit.framework.TestCase;

public class UserModelIntegrationTest extends  TestCase {

    public void testSQLTestingSuccess() throws Exception {
        UserModel action = new UserModel();
        action.setUser("test");
        action.setPassword(PasswordHasher.hashString("test"));
        String result = action.execute();
        assertEquals(Action.SUCCESS, result);
    }
}
