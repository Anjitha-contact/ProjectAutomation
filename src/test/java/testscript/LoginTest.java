package testscript;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.Contants;
import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.GrocceryExcelUtilities;



public class LoginTest extends  Base{
	public HomePage homepage;
	
	@Test(priority=1,description ="successful user login with valid credential",groups= {"smoke"},retryAnalyzer=retryAnalyzer.Retry.class)
	public void verifyLoginWithValidCredentials() throws IOException {
		
		String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		
		LoginPage login = new LoginPage(driver);
		//login.enterUserNameonUsernameField(username);
		//login.enterPasswordinPasswordField(password);
		//login.clickonRemeberMe();
		//login.clickSigin();
		login.enterUserNameonUsernameField(username).enterPasswordinPasswordField(password);
		
		homepage=login.clickSigin();
		boolean dashboardDisplay=login.isDashboardDisplayed();
		Assert.assertTrue(dashboardDisplay,Contants.VALIDCREDENTIALERROR);
	}

	@Test(priority=2,description ="successful user login with valid password")
	public void verifyLoginWithaInvalidUsernameAndValidPassword() throws IOException {
		String username = GrocceryExcelUtilities.getStringData(2, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(2, 1, "loginsheet");
		
		LoginPage login = new LoginPage(driver);
		//login.enterUserNameonUsernameField(username);
		//login.enterPasswordinPasswordField(password);
		login.enterUserNameonUsernameField(username).enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
		
		
		boolean invalid=login.invalidmessage();
		Assert.assertTrue(invalid,Contants.INVALIDUSERERROR);
		
	}
	
	@Test(priority=3,description ="successfull user login with valid username")
	public void verifyLoginWithValidUsernameAndInvalidPassword() throws IOException {

		String username = GrocceryExcelUtilities.getStringData(3, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(3, 1, "loginsheet");
	
		LoginPage login = new LoginPage(driver);
		//login.enterUserNameonUsernameField(username);
		//login.enterPasswordinPasswordField(password);
		login.enterUserNameonUsernameField(username).enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
		
		boolean invalid=login.invalidmessage();
		Assert.assertTrue(invalid, Contants.INVALIDPASSWORDERROR);
		
		
	}
	@Test(priority=4,description ="successful user login with invalid credential",groups= {"smoke"})
	public void verifyLoginWithInvalidUsernameAndInvalidPassword() throws IOException
	{
		String username = GrocceryExcelUtilities.getStringData(4, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(4, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		//login.enterUserNameonUsernameField(username);
		//login.enterPasswordinPasswordField(password);
		login.enterUserNameonUsernameField(username).enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
		boolean invalid=login.invalidmessage();
		Assert.assertTrue(invalid, Contants.INVALIDCREDENTIALERROR);
		
	}
}

