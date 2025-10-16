package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtilities;

public class ManageFooterTextPage {
//@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-footertext']") WebElement moreinfo;
@FindBy(css="a[href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']") WebElement action;
@FindBy(xpath="//textarea[@id='content']") WebElement address;
@FindBy(xpath="//input[@id='email']") WebElement email;
@FindBy(xpath="//input[@id='phone']") WebElement phone;
@FindBy(xpath="//button[@name='Update']") WebElement update;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
public WebDriver driver;
public ManageFooterTextPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this); //initialize webElements uses initElements method
}
/*public void clickMoreinfo()
{
	moreinfo.click();
}*/
public ManageFooterTextPage clickTheActionButton()
{
	action.click();
	return this;
}
public ManageFooterTextPage enterTheAddress(String Address)
{
	address.clear();
	address.sendKeys(Address);
	return this;
}
public ManageFooterTextPage enterTheEmail(String Email)
{
	email.clear();
	email.sendKeys(Email);
	return this;
}
public ManageFooterTextPage enterThePhoneNumber(String Phone)
{
	phone.clear();
	phone.sendKeys(Phone);
	return this;
}
public ManageFooterTextPage clickUpdate()
{
	WaitUtilities waitutilities=new WaitUtilities();
	waitutilities.waitForElement(driver, update);
	update.click();
	return this;
}
public boolean isAlertLoaded()
{
	return alert.isDisplayed();	
}
}