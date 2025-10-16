package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPage {
	//@FindBy (css="a.small-box-footer[href$='/admin/list-news']") WebElement moreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']") WebElement EnterTheNews;
	@FindBy(xpath="//button[text()='Save']") WebElement Save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
public WebDriver driver;
public NewsPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this); 
}
/*public void clickThemoreinfo()
{
	moreinfo.click();
}*/
public NewsPage clickNew() {
	New.click();
	return this;
}
public NewsPage enterTheNews(String News)
{
	EnterTheNews.sendKeys(News);
	return this;
}
public NewsPage clickTheSave()
{
	Save.click();
	return this;
}
public boolean isAlertLoaded()
{
	return alert.isDisplayed();	
}
}
