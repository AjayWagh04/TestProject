package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("q")).sendKeys("samsung f22");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(3000);
	   String priceOfSamsungf22 = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row'] /descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	   System.out.print("price Of Samsung f22:"+priceOfSamsungf22);
		
		
		
		
		
	}

}
 