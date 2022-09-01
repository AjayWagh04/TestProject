package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Softwere/Selenium%20Data/Html/checkbox.html");
		Thread.sleep(3000);
		WebElement Element = driver.findElement(By.id("automation"));
		Element.click();
		boolean Status = Element.isSelected();
		System.out.println(Status);
	}
}
