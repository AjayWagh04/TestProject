package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlags {
  @Test(groups = "FUNCTION")
  public void ft1() 
  {
	  Reporter.log("Functional Test Case1",true);
  }
  @Test(groups = "SMOKE")
  public void st1() 
  {
	  Reporter.log("smoke Test Case1",true);
  }
  @Test(groups = "INTEGRATION")
  public void it1() 
  {
	  Reporter.log("Integration Test Case1",true);
  }
 
  //..............................................................................................
  @Test(groups = "FUNCTION")
  public void ft2() 
  {
	  Reporter.log("Functional Test Case2",true);
  }
  @Test(groups = "SMOKE")
  public void st2() 
  {
	  Reporter.log("smoke Test Case2",true);
  }
  @Test(groups = "INTEGRATION")
  public void it2() 
  {
	  Reporter.log("Integration Test Case2",true);
  }
  //...................................................................................................................
  
@Test(groups = "FUNCTION")
public void ft3() 
{
	  Reporter.log("Functional Test Case3",true);
}
@Test(groups = "SMOKE")
public void st3() 
{
	  Reporter.log("smoke Test Case3",true);
}
@Test(groups = "INTEGRATION")
public void it3() 
{
	  Reporter.log("Integration Test Case3",true);
}
}
