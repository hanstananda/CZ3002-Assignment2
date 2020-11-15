package cz3002.group43;

import cz3002.group43.utils.PasswordHasher;
import junit.framework.TestCase;

public class PasswordHasherTest extends TestCase {
    public void testHashCorrectSimple() throws Exception {
        String hashed="7iaw3Ur350mqGo7jwQrpkj9hiYB3Lkc/iBml1JQODbJ6wYX4oOHV+E+IvIh/1nsUNzLDBMxfqa2Ob1f1ACio/w==";
        String result = PasswordHasher.hashString("test");
        assertEquals(hashed, result);
    }

    public void testHashCorrectCamelCase() throws Exception {
        String hashed="9VHVZ8gK6OuK6JCLtBYJT49e4oxCKB9kWL9mjxelj+h2YZr2UVKH+qjDkCleSz61pPeZDpDpJWywKGYZLSZPhQ==";
        String result = PasswordHasher.hashString("TestMePlsPassword123");
        assertEquals(hashed, result);
    }

}
