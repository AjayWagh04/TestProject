package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestActiTimeValidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage((WebElement) driver);
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readPropertiesFile(PROP_PATH,"username"),flib.readPropertiesFile(PROP_PATH,"password"));
	   
	}

}
