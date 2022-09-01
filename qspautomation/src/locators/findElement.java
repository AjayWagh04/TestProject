package locators;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(3000);
		
		WebElement webElementSuggessions = driver.findElement(By.xpath("//div[@class='eIPGRd']/span"));
		
		
		
		
		

	}

}
