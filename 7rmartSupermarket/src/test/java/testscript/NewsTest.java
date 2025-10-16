package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.NewsPage;
import utilities.ExcelUtility;

public class NewsTest extends Base {
	
	NewsPage newspage;
	HomePage homepage;

	
	@Test(description = "To add new News into newsPage")
	public void verifyTheUserCanAccessManageNewsPage() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password=ExcelUtility.getStringData(1, 1, "Loginpage");
		String news=ExcelUtility.getStringData(1, 0, "Newspage");
		//String news="New grocery offer available this week!";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		
		loginpage.clickTheSignin();
		//NewsPage newspage=new NewsPage(driver);
		newspage=homepage.clickThemoreinfomanagenews();
		newspage.clickNew().enterTheNews(news).clickTheSave();
		
		boolean alert=newspage.isAlertLoaded();
		Assert.assertTrue(alert,Constant.ADDNEWS);
	}	
	}
				
				
				

