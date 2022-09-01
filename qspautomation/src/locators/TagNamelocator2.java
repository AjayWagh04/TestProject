package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class TagNamelocator2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\ajayw\\OneDrive\\Desktop\\Html");
		
		

	}

}
