package WebBasedPopup;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionpopUp {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style='border-radius: 14px;']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-relative homeCalender']")).click();
		
		
		
		
	}
}