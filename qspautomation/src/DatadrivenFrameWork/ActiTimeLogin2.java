package DatadrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://ajay_wagh/login.do");
		
		Flib2 Flib = new Flib2();
		int rc = Flib.getRowCount("./Data/TestDataAct2.xlsx","Invalidcreds");
		
		for (int i=1;i<=rc;i++) 
		{
		
		String username = Flib.ReadExelData("./Data/TestDataAct2.xlsx","invalidcreds", i,0);
		String password = Flib.ReadExelData("./Data/TestDataAct2.xlsx","invalidcreds", i,1);
		System.out.println(i);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).clear();
		
		

		}	
		
	}
}
