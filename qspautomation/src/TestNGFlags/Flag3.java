package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(priority = 2)
  public void f() 
  {
	  Reporter.log("");
  }
}
