package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.findElement(By.id("prompt")).click();
		
		Alert Al = driver.switchTo().alert();
		Thread.sleep(3000);
		Al.sendKeys("Automation");
		Thread.sleep(2000);
		Al.accept();
		
		
		
	}
}
