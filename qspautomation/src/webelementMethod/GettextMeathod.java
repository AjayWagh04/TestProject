package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextMeathod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement Web1 = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
		String textofWeb1 = Web1.getText();
		System.out.println(textofWeb1);
				
		}
}
