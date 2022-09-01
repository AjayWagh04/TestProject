package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Max {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		
		ChromeOptions Co = new ChromeOptions();
		Co.addArguments("-start-maximized-");
		ChromeDriver driver = new ChromeDriver(Co);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		driver.get("https://www.bluestone.com");
		driver.findElement(By.id("confirmBtn")).click();
		
		
		

	}
}
