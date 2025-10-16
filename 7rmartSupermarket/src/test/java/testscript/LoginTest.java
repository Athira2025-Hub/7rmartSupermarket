package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	
	@Test(groups="regression")
	public void verifyTheUserisAbleToLoginWithValidCredentials() throws IOException
	{

		//String username="admin";
		//String password="admin";
		String username=ExcelUtility.getStringData(1,0,"Loginpage");
		String password=ExcelUtility.getStringData(1,1,"Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		boolean homepage=loginpage.isHomepageloaded(); //validation 
		Assert.assertTrue(homepage,Constant.LOGINVALIDCREDENTIALS); //hard assertion put always last
	}
		@Test
	public void verifyTheUserisAbleToLoginWithInValidPassword() throws IOException
	{
	   //String username="admin";
	   //String password="admin11";
		String username=ExcelUtility.getStringData(2, 0, "Loginpage");
		String password=ExcelUtility.getStringData(2, 1, "Loginpage");
	   LoginPage loginpage=new LoginPage(driver);
	   loginpage.enterTheUserName(username).enterThePassword(password);
	   loginpage.clickTheSignin();
	   boolean alert=loginpage.isAlertloaded();
	   Assert.assertTrue(alert,Constant.INVALIDPASSWORD);
	}
		@Test
	public void verifyTheUserisAbleToLoginWithInValidUsername() throws IOException
	{
		//String username="admin11";
		//String password="admin";
		String username=ExcelUtility.getStringData(3, 0, "Loginpage");
		String password=ExcelUtility.getStringData(3, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		
		loginpage.clickTheSignin();
		boolean alert=loginpage.isAlertloaded();
		Assert.assertTrue(alert,Constant.INVALIDUSERNAME);	
	}
		@Test(dataProvider="LoginProvider")
	public void verifyTheUserisAbleToLoginWithInValidCredentials(String username, String password) throws IOException
	{
		//String username="admin11";
		//String password="admin12";
		//String username=ExcelUtility.getStringData(4, 0, "Loginpage");
		//String password=ExcelUtility.getStringData(4, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		
		loginpage.clickTheSignin();
		boolean alert=loginpage.isAlertloaded();
		Assert.assertTrue(alert,Constant.INVALIDCREDENTIALS);	
	}
		@DataProvider(name="LoginProvider") 
	 	public Object[][] getDataFromTestData() throws IOException{ 
	 		return new Object[][] {{ExcelUtility.getStringData(4, 0,"Loginpage"),ExcelUtility.getStringData(4,1,"Loginpage")}}; 
	 
	 	}
	}


