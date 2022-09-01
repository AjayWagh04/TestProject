package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsMethod {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/singleselectdropdown.html");
		Thread.sleep(3000);
		WebElement Multiselcted = driver.findElement(By.id("menu"));
		Select sal= new Select(Multiselcted);
		
		List<WebElement> Op = sal.getOptions();
		
		for (int i = 0; i <Op.size(); i++) 
		{
		WebElement All = Op.get(i);
		String text = All.getText();
		System.out.println(text);
		Thread.sleep(2000);
		}
		
		
	}

}
