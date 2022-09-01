package MultiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectByValueMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/multiselectdropdown.html");
		Thread.sleep(3000);
		WebElement MultiSelect = driver.findElement(By.id("menu"));
		Select Sal = new Select(MultiSelect);
		
		Sal.selectByValue("v3");
		Thread.sleep(2000);
		Sal.deselectByValue("v3");
	
	}
}
