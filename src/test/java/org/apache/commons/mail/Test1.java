package org.apache.commons.mail;

import junit.framework.TestCase;

public class Test1 extends TestCase {
    Email testEmail;
    public void setUp() {
        testEmail = new SimpleEmail();
    }
    public void testCc() throws EmailException
    {
        System.out.println("Goal is to test the Bcc and verify it equals what its supposed to equal");
        System.out.println("kxm___");
        testEmail.addCc("one@email.com");
        assertEquals("one@email.com", testEmail.getCcAddresses().get(0).toString());
    }


}
