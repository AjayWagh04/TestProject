package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimelogin {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://actitime.summant.com/login.jsp");
		Thread.sleep(8000);
		driver.findElement(By.className("username")).sendKeys("admin");
		driver.findElement(By.className("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		
		
		

	}

}
