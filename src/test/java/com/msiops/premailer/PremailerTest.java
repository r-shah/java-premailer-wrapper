package com.msiops.premailer;

import static org.junit.Assert.*;
import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;
import org.junit.Test;


public class PremailerTest {

    final String filename = System.getProperty( "user.dir" )
            + "/premailer_contact.rb";

    @Test
    public void testHelloFromRuby() {

        // Create instace of jruby scriipt container
        ScriptingContainer container = new ScriptingContainer( );
        Object receiver = container.runScriptlet( PathType.ABSOLUTE,
                filename );

        // Create instance of premailer interface
        PremailerInterface premailer = container.getInstance( receiver,
                PremailerInterface.class );

        assertEquals( "Hello from Ruby", premailer.test_method( ) );
    }

}
