package cz3002.group43;
import com.opensymphony.xwork2.Action;
import cz3002.group43.model.UserModel;
import junit.framework.TestCase;

public class UserModelTest extends  TestCase {

    public void testSQLTestingSuccess() throws Exception {
        UserModel action = new UserModel();
        action.setUser("FARHAN");
        action.setPassword("FARHAN");
        String result = action.execute();
        assertEquals(Action.SUCCESS, result);
    }
}
