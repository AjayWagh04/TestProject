package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpAccept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/alert.html");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Thread.sleep(5000);
		
		Alert Al = driver.switchTo().alert();
		Al.accept();
		
		
		
		//1)Alert PopUp Method
		
		//Al.accept();
		//Al.Dismiss();
		//Al.SendKeys();
		//Al.GetText();
		
		//2)ConfirmationPopup
		
		
		
		
		
		
		
		
		
		
	}
}
