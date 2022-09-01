package OperationalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/singleselectdropdown.html");
		Thread.sleep(3000);
		WebElement Multiselected = driver.findElement(By.id("menu"));
		Select sal= new Select(Multiselected);
		
		boolean status = sal.isMultiple();
		System.out.println(status);
		
	}

}
