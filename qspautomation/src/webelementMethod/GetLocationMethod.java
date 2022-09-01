package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement LoginButton = driver.findElement(By.name("login"));
		Point getloc = LoginButton.getLocation();
	    int xaxis = getloc.getX();
	    int yaxis = getloc.getY();
	    System.out.println("The placement of login is as follow");
	    System.out.println("X axis distance : "+xaxis);
	    System.out.println("Y axis distance : "+yaxis);
	    
	}

}
