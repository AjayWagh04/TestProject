package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	// Declaration
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropdown;
	@FindBy(xpath="//a[contains(text(),'Create new tasks')]") private WebElement createNewTaskLink;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTime;
	@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement Logoutlink;
	
	
	// utilization
	public HomePage(WebElement driver) 
	{
		PageFactory.initElements(driver,this);
	}

	
	// initialization
	public WebElement getEnterTimeTrackDropdown() {
		return enterTimeTrackDropdown;
	}
	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}
	public WebElement getSaveLeaveTime() {
		return saveLeaveTime;
	}
	public WebElement getLogoutlink() {
		return Logoutlink;
	}
	
	//operational Method
	public void logOutActiTime() 
	{
	 Logoutlink.click();	
	} 
	{
		
		
	}

}
