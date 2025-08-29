package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.GrocceryBase;
import pages.AdminUsersPage;
import pages.GrocceryLoginPage;
import pages.HomePage;
import utilities.GrocceryExcelUtilities;

public class AdminUsersTest  extends GrocceryBase {
	@Test
	public void verifywhetherUserIsableToClickOnAdminicon() throws IOException
	{
		String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
			String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
			GrocceryLoginPage login = new GrocceryLoginPage(driver);
			login.enterUserNameonUsernameField(username);
			login.enterPasswordinPasswordField(password);
			login.clickonRemeberMe();
			login.clickSigin();
			HomePage homepage=new HomePage(driver);
			homepage.clickonadminicon();
			AdminUsersPage adminuser=new AdminUsersPage(driver);
			adminuser.clickonadminuser();
			
	}

}
