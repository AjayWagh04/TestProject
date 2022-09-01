package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextNSAE {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/confirmation.html");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Thread.sleep(2000);
		
		Alert Al = driver.switchTo().alert();
		Al.accept();
		
		String Text = Al.getText();
		System.out.println(Text);
		
		
		
		
		//Al.GetText()-NoAlertPresentException
		
		
		
		
		
		
		
		
		
		
	}
}
