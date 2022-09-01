package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		
		ChromeOptions Op = new ChromeOptions();
		Op.addArguments("--disable-notifications-");
		ChromeDriver driver = new ChromeDriver(Op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		driver.get("https://www.bluestone.com");
		driver.findElement(By.id("confirmBtn")).click();
		
		
		

	}
}
