package DatadrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ajay_wagh/login.do");
		
		
		
		
		
	    Flib flib = new Flib();
	    String username = flib.ReadExelData("./Data/TestDataAct.xlsx","Validcreds",1,0);
	    String password = flib.ReadExelData("./Data/TestDataAct.xlsx","Validcreds",1,1);
	    
	    
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
