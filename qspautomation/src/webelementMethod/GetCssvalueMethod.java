package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssvalueMethod {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com");
				Thread.sleep(2000);
				WebElement LoginButton = driver.findElement(By.name("login"));
				String CssValue = LoginButton.getCssValue("position");
				System.out.println(CssValue);
					
			
			}
			}

