package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.chainsaw.Main;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class BaseTest implements IAutoConstant
{
	
	static WebDriver driver;
	
	public void openBrowser() throws IOException {
		
		Flib flib = new Flib();
	    String browser = flib.readPropertiesFile(PROP_PATH,"browser");
	    String url = flib.readPropertiesFile(PROP_PATH,"url");
	    
	    if (browser.equalsIgnoreCase("browser")) 
	    {
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("url");
	    }
			
			else if (browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty(GECKO_KEY,GECKO_VALUE);
				new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				driver.get("url");
            }
	}
	public void closeBrowser()
	{
	driver.quit();	
	}
	}
		
		


