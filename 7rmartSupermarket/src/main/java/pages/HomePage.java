package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
@FindBy(css="a.dropdown-item[href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
@FindBy(xpath="//button[text()='Sign In']")WebElement signin;

@FindBy(xpath="//button[text()='Sign In']")WebElement loginsignin;

@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-admin']") WebElement adminusermoreinfo;

@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-category']") WebElement managecategorymoreinfo;

@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-contact']") WebElement managecontactmoreinfo;

@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-footertext']") WebElement managefootertextmoreinfo;

@FindBy (css="a.small-box-footer[href$='/admin/list-news']") WebElement managenewsmoreinfo;

public WebDriver driver;
public HomePage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this); //initialize webElements uses initElements method
}

public HomePage clickTheSignin()
{
	loginsignin.click();
	return new HomePage(driver);
}

public HomePage clickTheMoreinfoadminuser()
{
	adminusermoreinfo.click();
	return new HomePage(driver);
}

public HomePage clickMoreinfomanagecategory()
{
	managecategorymoreinfo.click();
	return new HomePage(driver);
}

public HomePage clickThemoreinfomanagecontact()
{
	managecontactmoreinfo.click();
	return new HomePage(driver);
}

public HomePage clickMoreinfomanagefootertext()
{
	managefootertextmoreinfo.click();
	return new HomePage(driver);
}

public HomePage clickThemoreinfomanagenews()
{
	managenewsmoreinfo.click();
	return new HomePage(driver);
}

public void clickTheAdmin()
{
	admin.click();
	
}
public void clickTheLogout()
{
	logout.click();
	
}
public boolean isLoginPageDisplayed()
{
	return signin.isDisplayed();	
}
}