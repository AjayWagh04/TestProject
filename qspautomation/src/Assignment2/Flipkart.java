package Assignment2;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		driver.findElement(By.xpath("//div[@class='_2C41yO' ].[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
