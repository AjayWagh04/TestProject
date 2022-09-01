package Assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoToCleartrip {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style='border-radius: 14px;']")).click();
		Thread.sleep(2000);
		WebElement Ele = driver.findElement(By.xpath("//h2[text()='Fly anywhere. Fly everywhere']"));
		
		Actions Act = new Actions(driver);
		
		for (int i=0;i<=2;i++)
        {
		Act.clickAndHold(Ele).perform();	
		}
		Thread.sleep(3000);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).click();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		driver.findElement(By.name("btnK")).click();
		
		

		
		


		
		
		
		
		
		
		
	}
}
