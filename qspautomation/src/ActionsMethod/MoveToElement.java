package ActionsMethod;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ' and  @title='Jewellery']"));
		
		Actions Act = new Actions(driver);
		Thread.sleep(1000);
		Act.moveToElement(target).perform();
		
		
		driver.findElement(By.xpath("//a[text()='Kadas']")).click();
		
		
		
		
		
		
		
		
		
		
		// MouseHover
		
		
		
		
		
		
	}
}
