package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("");
		
		
	}

}


//ScrollRight
