package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.GrocceryBase;
import pages.GrocceryLoginPage;
import utilities.GrocceryExcelUtilities;

public class LoginTest extends  GrocceryBase{
	
	@Test
	public void verifyLoginWithValidCredentials() throws IOException {
		String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		GrocceryLoginPage login = new GrocceryLoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();

	}

	@Test
	public void verifyLoginWithaInvalidUsernameAndValidPassword() throws IOException {
		String username = GrocceryExcelUtilities.getStringData(2, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(2, 1, "loginsheet");
		GrocceryLoginPage login = new GrocceryLoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
	}
	
	@Test
	public void verifyLoginWithValidUsernameAndInvalidPassword() throws IOException {

		String username = GrocceryExcelUtilities.getStringData(3, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(3, 1, "loginsheet");
		
		GrocceryLoginPage login = new GrocceryLoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
	}
	@Test
	public void verifyLoginWithInvalidUsernameAndInvalidPassword() throws IOException
	{
		String username = GrocceryExcelUtilities.getStringData(4, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(4, 1, "loginsheet");
		GrocceryLoginPage login = new GrocceryLoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
	}
		
}
