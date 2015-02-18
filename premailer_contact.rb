
require File.expand_path(File.dirname(__FILE__)) + '/lib/Premailer/Premailer'
require "java"

#$CLASSPATH << 'target/classes';
java_import "com.msiops.premailer.PremailerInterface"

class PremailerContact
  include PremailerInterface


  def initialize
  end

  def init(html, options)

    options.keys.each do |key|
      options[(key.to_sym rescue key) || key] = options.delete(key)
    end

    @defaultOption = {:adapter => :nokogiri, :input_encoding => 'UTF-8', }

    @pr = Premailer.new(html, options.merge(@defaultOption))
  end


  def inline_css

    return @pr.to_inline_css
  end


  def plain_text

    return @pr.to_plain_text
  end


  def test_method
    return "Hello from Ruby"
  end

end

PremailerContact.new
