package ActionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement Ele = driver.findElement(By.xpath("//a[.='Login']")); 
		Thread.sleep(5000);
		Actions act = new Actions (driver); 
		act.contextClick (Ele).perform();
		
		
		//Right Click
		
		
		
	}
}
