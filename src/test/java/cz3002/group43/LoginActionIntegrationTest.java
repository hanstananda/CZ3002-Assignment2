/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz3002.group43;

import cz3002.group43.actions.LoginAction;
import junit.framework.TestCase;

import com.opensymphony.xwork2.Action;

/**
 * 
 */
public class LoginActionIntegrationTest extends TestCase {
    
    public void testLoginActionSuccess() throws Exception {
        LoginAction action = new LoginAction();
        action.setUsername("test");
        action.setPassword("test");
        String result = action.execute();
        assertEquals(Action.SUCCESS, result);
    }

    public void testWrongCredentialError() throws  Exception {
        LoginAction action = new LoginAction();
        action.setUsername("test");
        action.setPassword("wrong");
        String result = action.execute();
        assertEquals(Action.ERROR, result);
    }
}

