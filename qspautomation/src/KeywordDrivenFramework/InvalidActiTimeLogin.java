package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidActiTimeLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"inValidcreds");
		
		 
		
		for (int i=1;i<=rc;i++) 
		{
		String username=flib.readExcelData(EXCEL_PATH,"InValidcreds",i,0);
		String password=flib.readExcelData(EXCEL_PATH,"InValidcreds",i,1);
			
		 System.out.println(i);
	     driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 Thread.sleep(3000);
	     driver.findElement(By.id("loginButton")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.name("username")).clear();
	    
	     bt.closebrowser();
		}
	}
}
