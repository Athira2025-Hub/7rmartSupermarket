package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	@Test
public void verifyTheUserIsAbleToLogout() throws IOException 
{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password=ExcelUtility.getStringData(1, 1, "Loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		
	    LogoutPage logoutpage=new LogoutPage(driver);
	    logoutpage.clickTheAdmin();
	    logoutpage.clickTheLogout();
	    boolean signin=logoutpage.isLoginPageDisplayed();
	    Assert.assertTrue(signin, Constant.LOGOUTFROMPAGE);
}
}
