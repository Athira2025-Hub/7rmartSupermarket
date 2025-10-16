package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	
	AdminUserPage adminuserpage;
	HomePage homepage;
	
	@Test
	public void verifyUserCanAddNewAdminUsers() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password=ExcelUtility.getStringData(1, 1, "Loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		
		homepage.clickTheSignin();
		
		//AdminUserPage adminuserpage=new AdminUserPage(driver);
		homepage.clickTheMoreinfoadminuser();
		adminuserpage.clickNew();
		
		//String UserName=ExcelUtility.getStringData(1, 0, "AdminUser");
		//String Password=ExcelUtility.getStringData(1, 1, "AdminUser");
		
		FakerUtility fakerutility=new FakerUtility();
		String UserName=fakerutility.creatARandomFirstName();
		String Password=fakerutility.creatARandomLastName();
		
		adminuserpage.enterUserName(UserName).enterPassword(Password).selectUserType().clickSave();
		
		boolean alert=adminuserpage.isAlertLoaded();
		Assert.assertTrue(alert,Constant.ADDADMINUSER);
	}
}
