package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	
	ManageFooterTextPage managefootertextpage;
	HomePage homepage;

	
	@Test
	public void verifyUserCanUpdateFooterText() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password=ExcelUtility.getStringData(1, 1, "Loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		
		homepage=loginpage.clickTheSignin();
		
		//ManageFooterTextPage managerfootertextpage=new ManageFooterTextPage(driver);
		managefootertextpage=homepage.clickMoreinfomanagefootertext();
		managefootertextpage.clickTheActionButton();
		
		String Address=ExcelUtility.getStringData(1, 0, "ManageFooterText");
		String Email=ExcelUtility.getStringData(1, 1, "ManageFooterText");
		String Phone=ExcelUtility.getIntegerData(1, 2, "ManageFooterText");
		
		managefootertextpage.enterTheAddress(Address).enterTheEmail(Email).enterThePhoneNumber(Phone).clickUpdate();
		
		boolean alert=managefootertextpage.isAlertLoaded();
		Assert.assertTrue(alert,Constant.UPDATEFOOTER);
	}
}
