package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeLogin extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openbrowser();// open the browser

		Flib flib = new Flib();
		
		// read the data from the property file
		String username = flib.ReadpropertiesData(PROP_PATH,"username");
		String password = flib.ReadpropertiesData(PROP_PATH,"password");
		
		// valid login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		
		// close the browser
		bt.closebrowser();
	}
}
