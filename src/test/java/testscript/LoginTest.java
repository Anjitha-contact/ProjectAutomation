package testscript;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.GrocceryExcelUtilities;

public class LoginTest extends  Base{
	
	@Test(priority=1,description ="sucessful user login with valid credential")
	public void verifyLoginWithValidCredentials() throws IOException {
		String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
		boolean dashboardDisplay=login.isDashboardDisplayed();
		Assert.assertTrue(dashboardDisplay,"User couldn't login with valid credential");
	}

	@Test(priority=2,description ="sucessful user login with valid password")
	public void verifyLoginWithaInvalidUsernameAndValidPassword() throws IOException {
		String username = GrocceryExcelUtilities.getStringData(2, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(2, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
		
		
		boolean invalid=login.invalidmessage();
		Assert.assertTrue(invalid, "User can  login with Invalid Username and valid password");
		
	}
	
	@Test(priority=3,description ="sucessful user login with valid username")
	public void verifyLoginWithValidUsernameAndInvalidPassword() throws IOException {

		String username = GrocceryExcelUtilities.getStringData(3, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(3, 1, "loginsheet");
	
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
	}
	@Test(priority=4,description ="sucessful user login with invalid credential")
	public void verifyLoginWithInvalidUsernameAndInvalidPassword() throws IOException
	{
		String username = GrocceryExcelUtilities.getStringData(4, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(4, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
	}
}

