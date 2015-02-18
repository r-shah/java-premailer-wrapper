package com.msiops.premailer;

import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;


final class Premailer {
    
    private final static String filename = System.getProperty( "user.dir" )
            + "/premailer_contact.rb";
    
    public static PremailerInterface createInstance(){
        // Create instace of jruby scriipt container
        ScriptingContainer container = new ScriptingContainer( );
        Object receiver = container.runScriptlet( PathType.ABSOLUTE,
                filename );

        // Create instance of premailer interface
        PremailerInterface premailer = container.getInstance( receiver,
                PremailerInterface.class );
        
        return premailer;
    }

}
