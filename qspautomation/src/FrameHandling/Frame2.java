package FrameHandling;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/username.html");
		
		
		driver.findElement(By.id("un")).sendKeys("Admin");
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.id("pwd")).sendKeys("Manager");
		
		
		//frame(int index)
		
		
		
		
	}
}
