package Assignment2;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		
		driver.switchTo().
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class='lc-1mwyrdx e16i86ec0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Ajay Wagh");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("Ajaywagh04@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("iqidymbywzi_146917605549304831")).sendKeys("9763271935");
		
		
		
		
		
		
		
	}

}
