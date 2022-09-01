package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/flipkartlink.html");
		Thread.sleep(5000);
		WebElement Link = driver.findElement(By.partialLinkText("flip"));
		Link.click();
	}

}
