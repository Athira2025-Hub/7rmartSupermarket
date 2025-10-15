package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
@FindBy(css="a.dropdown-item[href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
public WebDriver driver;
public LogoutPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this); //initialize webElements uses initElements method
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