package SingleSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnsupportedOperationException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/singleselectdropdown.html");
		Thread.sleep(3000);
		WebElement ssDropdown= driver.findElement(By.id("menu"));
		Select Sal = new Select(ssDropdown);
		Thread.sleep(2000);
		Sal.selectByVisibleText("Idli");
		Sal.deselectAll();
		
	}

}
