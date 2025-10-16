package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	
	ManageContactPage managecontactpage;
	HomePage homepage;
	
	@Test
public void verifyTheUserIsAbleToManageContact() throws IOException
{
	String username=ExcelUtility.getStringData(1, 0, "Loginpage");
	String password=ExcelUtility.getStringData(1, 1, "Loginpage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username).enterThePassword(password);
	
	loginpage.clickTheSignin();
	
	//ManageContactPage managecontactpage=new ManageContactPage(driver);
	managecontactpage=homepage.clickThemoreinfomanagecontact();
	managecontactpage.clickAction();
	
	String PhoneNumber=ExcelUtility.getIntegerData(1, 0, "ManageContact");
	String Email=ExcelUtility.getStringData(1, 1, "ManageContact");
	String Address=ExcelUtility.getStringData(1, 2, "ManageContact");
	String DeliveryTime=ExcelUtility.getIntegerData(1, 3, "ManageContact");
	String DeliveryChargeLimit=ExcelUtility.getIntegerData(1, 4, "ManageContact");
	
	managecontactpage.enterPhoneNumber(PhoneNumber).enterEmail(Email).enterAddress(Address).enterDeliveryTime(DeliveryTime).enterDeliveryChargeLimit(DeliveryChargeLimit).clickUpdate();
	
	boolean alert=managecontactpage.isAlertLoaded();
	Assert.assertTrue(alert,Constant.UPDATECONTACT);
}
}
