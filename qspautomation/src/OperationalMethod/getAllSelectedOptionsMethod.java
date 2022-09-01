package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/singleselectdropdown.html");
		Thread.sleep(3000);
		WebElement Multiselected = driver.findElement(By.id("menu"));
		Select sal= new Select(Multiselected);
		
		for (int i = 1; i <=6; i++) 
		{
		sal.selectByIndex(i);	
		}
		List<WebElement> allSelected = sal.getAllSelectedOptions();
		
		for (WebElement op:allSelected)
		{
		String Text = op.getText();	
		System.out.println(Text);
		}
		
	}

}
