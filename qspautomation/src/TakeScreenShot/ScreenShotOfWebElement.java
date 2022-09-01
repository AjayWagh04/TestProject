package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfWebElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com");
		WebElement loginButton = driver.findElement(By.cssSelector("button[class*='L3NKy ']"));
		
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/loginButton.jpg");
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
