package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

	}

}
  