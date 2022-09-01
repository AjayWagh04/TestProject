package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNamelocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("lNPNe")).click();
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
