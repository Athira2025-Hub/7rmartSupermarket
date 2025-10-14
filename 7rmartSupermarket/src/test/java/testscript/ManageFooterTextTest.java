package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	@Test
	public void verifyUserCanUpdateFooterText() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password=ExcelUtility.getStringData(1, 1, "Loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		
		ManageFooterTextPage managerfootertextpage=new ManageFooterTextPage(driver);
		managerfootertextpage.clickMoreinfo();
		managerfootertextpage.clickTheActionButton();
		
		String Address=ExcelUtility.getStringData(1, 0, "ManageFooterText");
		String Email=ExcelUtility.getStringData(1, 1, "ManageFooterText");
		String Phone=ExcelUtility.getIntegerData(1, 2, "ManageFooterText");
		
		managerfootertextpage.enterTheAddress(Address);
		managerfootertextpage.enterTheEmail(Email);
		managerfootertextpage.enterThePhoneNumber(Phone);
		managerfootertextpage.clickUpdate();
		boolean alert=managerfootertextpage.isAlertLoaded();
		Assert.assertTrue(alert,Constant.UPDATEFOOTER);
	}
}
