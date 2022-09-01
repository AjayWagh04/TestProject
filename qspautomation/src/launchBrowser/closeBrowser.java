package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class closeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
		
	}

}
