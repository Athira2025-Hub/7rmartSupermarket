package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath="//input[@placeholder='Username']")WebElement ccusername;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement ccpw;
	//@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	public WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //initialize webElements uses initElements method
	}
	public LoginPage enterTheUserName(String username)
	{
		ccusername.sendKeys(username);
		return this;
	}
	public LoginPage enterThePassword(String password)
	{
		ccpw.sendKeys(password);
		return this;
	}
	/*public void clickTheSignin()
	{
		signin.click();
	}*/
	public boolean isHomepageloaded() //for validation
	{
		return dashboard.isDisplayed();
	}
	public boolean isAlertloaded()
	{
		return alert.isDisplayed();
	}
	}


