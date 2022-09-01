package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd")private WebElement pass;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement checkbox;
	@FindBy(xpath="//a[contains(text(),'Actimind Inc.')]" )private WebElement linkActitime;
	@FindBy(id="licenseLink")private WebElement licenceLink;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement Acttimelogo;
	
	// initialization
	public LoginPage(WebElement driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	// Utilization
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getLinkActitime() {
		return linkActitime;
	}
	public WebElement getLicenceLink() {
		return licenceLink;
	}
	public WebElement getActtimelogo() {
		return Acttimelogo;
	}
	
	// operational method
	 public void validLoginActiTime(String validusername, String validpassword)  
	 {
		 usn.sendKeys(validusername);
		 pass.sendKeys(validpassword);
		 loginButton.click();
		 
		
	}
	 public void InvalidLoginActiTime(String invalidusername,String invalidpassword) throws InterruptedException
	 {
		 usn.sendKeys(invalidusername);
		 pass.sendKeys(invalidpassword);
		 loginButton.click();
		 Thread.sleep(4000);
		 usn.clear();
		 
		
	}
	
	
	

}
