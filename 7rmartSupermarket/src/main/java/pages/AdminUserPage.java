package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUserPage {
@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-admin']") WebElement moreinfo;
@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New; 
@FindBy(xpath="//input[@id='username']") WebElement Username;
@FindBy(xpath="//input[@id='password']") WebElement Password;
@FindBy(xpath="//select[@id='user_type']") WebElement UserType;
@FindBy(xpath="//button[@name='Create']") WebElement Save;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
public WebDriver driver;
public AdminUserPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this); //initialize webElements uses initElements method
}
public void clickTheMoreinfo()
{
	moreinfo.click();
}
public void clickNew()
{
	New.click();
}
public void enterUserName(String username)
{
	Username.sendKeys(username);
}
public void enterPassword(String password)
{
	Password.sendKeys(password);
}
public void selectUserType()
{
	//Select select=new Select(UserType);
	//select.selectByVisibleText("Admin");
	PageUtility pageutility=new PageUtility();
	pageutility.selectByIndex(UserType, 2);
}
public void clickSave()
{
	Save.click();
}
public boolean isAlertLoaded()
{
	return alert.isDisplayed();
}
}
