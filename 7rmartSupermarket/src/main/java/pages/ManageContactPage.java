package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {

@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-contact']") WebElement moreinfo;
@FindBy(xpath="//i[@class='fas fa-edit']") WebElement action;
@FindBy(xpath="//input[@id='phone']") WebElement phone;
@FindBy(xpath="//input[@id='email']") WebElement email;
@FindBy(xpath="//textarea[@placeholder='Enter the Address']") WebElement address;
@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']") WebElement deliverytime;
@FindBy(xpath="//input[@id='del_limit']") WebElement deliverychargelimit;
@FindBy(xpath="//button[contains(@class,'btn-info')]") WebElement update;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
public WebDriver driver;
public ManageContactPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this); //initialize webElements uses initElements method
}
public void clickThemoreinfo()
{
	moreinfo.click();
}
public void clickAction() 
{
	action.click();
}
public void enterPhoneNumber(String phoneNumber)
{
	phone.clear();
	phone.sendKeys(phoneNumber);
}
public void enterEmail(String Email)
{
	email.clear();
	email.sendKeys(Email);
}
public void enterAddress(String Address)
{
	address.clear();
	address.sendKeys(Address);
}
public void enterDeliveryTime(String DeliveryTime)
{
	deliverytime.clear();
	deliverytime.sendKeys(DeliveryTime);
}
public void enterDeliveryChargeLimit(String DeliveryChargeLimit)
{
	deliverychargelimit.clear();
	deliverychargelimit.sendKeys(DeliveryChargeLimit);
}
public void clickUpdate()
{
	//update.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", update);
}
public boolean isAlertLoaded()
{
	return alert.isDisplayed();
}
}

