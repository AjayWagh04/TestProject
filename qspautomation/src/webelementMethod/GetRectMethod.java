package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement LoginButton = driver.findElement(By.name("login"));
		Rectangle getrect = LoginButton.getRect();
	    System.out.println("Width  : "+getrect.getWidth());
	    System.out.println("height : "+getrect.getHeight());
	    System.out.println("x Axis : "+getrect.getX());
	    System.out.println("y Axis : "+getrect.getY());
	    
	    
	  
	    
		
		
	}
}
