package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	LoginPage loginpage;
	HomePage homepage;
	
	@Test
public void verifyTheUserIsAbleToLogout() throws IOException 
{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password=ExcelUtility.getStringData(1, 1, "Loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		
		homepage.clickTheSignin();
		
	    //HomePage logoutpage=new HomePage(driver);
		homepage.clickTheAdmin().clickTheLogout();
	    
	    boolean signin=homepage.isLoginPageDisplayed();
	    Assert.assertTrue(signin, Constant.LOGOUTFROMPAGE);
}
}
