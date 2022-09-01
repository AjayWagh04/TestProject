package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("_2KpZ6l _1sbqEe _3AWRsL")).click();
		
	}

}
