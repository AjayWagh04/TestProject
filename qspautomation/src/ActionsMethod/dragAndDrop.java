package ActionsMethod;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='shoppingCart']/descendant::ol[@id='bank']"));
		
		Actions Act = new Actions(driver);
		Act.dragAndDrop(src, dest).perform(); 
		
			
			
		
		
	}

}
