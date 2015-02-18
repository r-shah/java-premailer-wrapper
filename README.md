# Java Premailer Wrapper

## What is this?

This java wrapper around [Premailer](https://github.com/premailer/premailer).


## Example

```java
		String testHtml = "<html><head></head><body><p>test</p></body></html>";
		
        // Create an instance of a Premailer interface 
        PremailerInterface premailer = Premailer.createInstance( );
        
        // Pass your options in form of HashMap
        Map<String, Object> options = new HashMap<String, Object>( );
        
        // Pass at least this option for html string
        options.put( "with_html_string", true );
        
        // Initialize premailer with html and options
        premailer.init( testHtml, options );
        
        System.out.print( premailer.plain_text( ) );
        System.out.print( premailer.inline_css( ) );
        
```
