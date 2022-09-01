package Assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.ah.A;

public class GoToAnyApp {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		
		WebElement Ele = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		Actions Act = new Actions(driver);
		Act.contextClick(Ele).perform();
		
		
		
		Robot robot = new Robot();
		
		for (int i = 0; i<=9;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		    robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
