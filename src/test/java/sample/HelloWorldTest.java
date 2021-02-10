package sample;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
  @Test
  public void testHelloWorld() {
    Assert.assertEquals(new HelloWorld().helloWorld(), "Hello World!");
  }
}
