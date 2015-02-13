require "java"

$CLASSPATH << 'target/classes';
java_import "com.msiops.premailer.PremailerInterface"

class PremailerContact
  include PremailerInterface


  def initialize
  end


  def test_method
    return "Hello from Ruby"
  end

end

PremailerContact.new
