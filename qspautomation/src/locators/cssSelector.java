package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		
		// to  login
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[name='Submit']")).click();
		
		
		
		
		

	}

}
