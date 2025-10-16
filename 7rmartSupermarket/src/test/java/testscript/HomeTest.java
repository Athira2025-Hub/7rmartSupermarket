package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	
	@Test
public void verifyTheUserIsAbleToLogout() throws IOException 
{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password=ExcelUtility.getStringData(1, 1, "Loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		
		loginpage.clickTheSignin();
		
	    HomePage logoutpage=new HomePage(driver);
	    logoutpage.clickTheAdmin();
	    logoutpage.clickTheLogout();
}
}
