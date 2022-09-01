package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("ajaywagh04@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ajay@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).submit();

		
		
		
	
	}

}
