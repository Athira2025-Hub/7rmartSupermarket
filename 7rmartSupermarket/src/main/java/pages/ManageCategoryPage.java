package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtilities;

public class ManageCategoryPage {
//@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-category']") WebElement moreinfo;
@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New;
@FindBy(xpath="//input[@placeholder='Enter the Category']") WebElement category;
@FindBy(xpath="//input[@id='main_img']") WebElement choosefile;
//@FindBy(xpath="//input[@name='top_menu' and @value='yes']") WebElement Topmenu;
//@FindBy(xpath="//input[@name='show_home' and @value='yes']") WebElement Leftmenu;
@FindBy(xpath="//button[@type='submit']") WebElement Save;
public WebDriver driver;
public ManageCategoryPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this); //initialize webElements uses initElements method
}
/*public void clickMoreinfo()
{
	moreinfo.click();
}*/
public ManageCategoryPage clickTheNewButton()
{
	New.click();
	return this;
}
public ManageCategoryPage enterCategory(String Category)
{
	category.sendKeys(Category);
	return this;
}
public ManageCategoryPage chooseFileToUploadImage()
{
	//choosefile.sendKeys(constant.Constant.TESTIMAGE);
	FileUploadUtilities fileuploadutilities=new FileUploadUtilities();
	fileuploadutilities.fileuploadusindsendkeys(choosefile, Constant.TESTIMAGE);
	return this;
}
public boolean isSaveButtonClicked()
{
	return Save.isDisplayed();
}
}
