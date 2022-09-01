package GetWindowHandle;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.MessageSizeEstimator.Handle;

public class GetWindowHandle {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		
		String ParentHandle = driver.getWindowHandle();
		System.out.println(ParentHandle);
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String handle:allhandles);
		{
		System.err.println(allhandles);
		}
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}
}
