package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	@Test
	public void verifyUserCanAddNewAdminUsers() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password=ExcelUtility.getStringData(1, 1, "Loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		
		AdminUserPage adminuserpage=new AdminUserPage(driver);
		adminuserpage.clickTheMoreinfo();
		adminuserpage.clickNew();
		
		//String UserName=ExcelUtility.getStringData(1, 0, "AdminUser");
		//String Password=ExcelUtility.getStringData(1, 1, "AdminUser");
		
		FakerUtility fakerutility=new FakerUtility();
		String UserName=fakerutility.creatARandomFirstName();
		String Password=fakerutility.creatARandomLastName();
		
		adminuserpage.enterUserName(UserName);
		adminuserpage.enterPassword(Password);
		adminuserpage.selectUserType();
		adminuserpage.clickSave();
		boolean alert=adminuserpage.isAlertLoaded();
		Assert.assertTrue(alert);
	}
}
