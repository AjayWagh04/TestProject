package TestNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
  @Test
  public void a() 
  {
   Reporter.log("hi i am from method a",true);
  }
}
