package com.msiops.premailer;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class PremailerTest {

    final String testHtml = "<html><head></head><body><p>test</p></body></html>";

    @Test
    public void testHelloFromRuby() {

        PremailerInterface premailer = Premailer.createInstance( );
        assertEquals( "Hello from Ruby", premailer.test_method( ) );
    }

    @Test
    public void testPremailerPlainText() {

        PremailerInterface premailer = Premailer.createInstance( );
        Map<String, Object> options = new HashMap<String, Object>( );

        options.put( "with_html_string", true );

        premailer.init( testHtml, options );
        assertEquals( "test", premailer.plain_text( ) );

    }

    @Test
    public void testPremailerInlineCSS() {

        PremailerInterface premailer = Premailer.createInstance( );
        Map<String, Object> options = new HashMap<String, Object>( );

        options.put( "with_html_string", true );

        premailer.init( testHtml, options );
        assertEquals( testHtml, premailer.inline_css( ) );

    }

}
