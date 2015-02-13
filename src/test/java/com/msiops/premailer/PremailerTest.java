package com.msiops.premailer;

import junit.framework.TestCase;

import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;






public class PremailerTest extends TestCase{

    
    final String filename = "premailer_contact.rb";
    
    public void testHelloFromRuby(){
        //Create instace of jruby scriipt container
        ScriptingContainer container = new ScriptingContainer( );
        Object receiver = container.runScriptlet( PathType.RELATIVE, filename);
        //Create instance of premailer interface
        PremailerInterface premailer = container.getInstance( receiver, PremailerInterface.class );
        
        assertEquals("Hello from Ruby", premailer.test_method( ));
    }
    
}
