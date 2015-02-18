package com.msiops.premailer;

import java.util.Map;

public interface PremailerInterface {

    public Object
            premailer_init( String html, Map<String, Object> options );

    String premailer_inline_css();

    String premailer_plain_text();

    public String test_method();

}
