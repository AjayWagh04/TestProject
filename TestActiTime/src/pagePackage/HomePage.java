package pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Declaration
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrack;
	@FindBy(xpath="//a[contains(text(),'tasks')]") private WebElement createNewTasks;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTime;
	@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement logOutLink;

	// initialization
	public HomePage(WebElement driver) 
	{
		PageFactory.initElements(driver,this);
	}

	// utilization

	public WebElement getEnterTimeTrack() {
		return enterTimeTrack;
	}
	public WebElement getCreateNewTasks() {
		return createNewTasks;
	}
	public WebElement getSaveLeaveTime() {
		return saveLeaveTime;
	}
	public WebElement getLogOutLink() {
		return logOutLink;
	}






}
