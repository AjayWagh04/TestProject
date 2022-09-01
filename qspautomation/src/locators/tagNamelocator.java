package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNamelocator {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\ajayw\\OneDrive\\Desktop\\Html");
		
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		

	}

}
