package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{
	
	ManageCategoryPage managecategorypage;
	HomePage homepage;
	
	@Test
public void verifyUserCanCreateNewCategory() throws IOException
{
	String username=ExcelUtility.getStringData(1, 0, "Loginpage");
	String password=ExcelUtility.getStringData(1, 1, "Loginpage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username).enterThePassword(password);
	
	homepage.clickTheSignin();
	
	//ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
	homepage.clickMoreinfomanagecategory();;
	managecategorypage.clickTheNewButton();
	
	String Category=ExcelUtility.getStringData(1, 0, "ManageCategory");
	
	managecategorypage.enterCategory(Category).chooseFileToUploadImage();
	managecategorypage.chooseFileToUploadImage();
	boolean save=managecategorypage.isSaveButtonClicked();
	Assert.assertTrue(save,Constant.ADDCATEGORY);
	System.out.println("Save Button Is displayed");
}
}
