package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class closeFirefox {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver(); //open FIrefoxBrowser
	 Thread.sleep(5000); //delay for 5 sec
	 driver.close(); //Close the Browser

	}

}
