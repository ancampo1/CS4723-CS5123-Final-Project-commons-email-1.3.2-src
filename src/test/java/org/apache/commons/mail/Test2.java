package org.apache.commons.mail;

import junit.framework.TestCase;

public class Test2 extends TestCase {
    Email testEmail;
    public void setUp() {
        testEmail = new SimpleEmail();
    }
    public void testFinal()
    {
        System.out.println("Goal is to test socket connection timout actually is correct");
        System.out.println("kxm___");
      testEmail.setSocketConnectionTimeout(6000);
      assertEquals(6000,testEmail.getSocketConnectionTimeout());

    }

}
