package testscript;



import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.GrocceryExcelUtilities;

public class AdminUsersTest  extends Base {
	
	@Test
	public void verifywhetherUserIsableToClickOnAddNewUser() throws IOException
	{
		String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
	String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
		
		AdminUsersPage adminuser=new AdminUsersPage(driver);
		adminuser.clickonadminuser();
		adminuser.newuser();	
}
	@Test
public void verifywhetherUserIsableToClickOnSearchButton() throws IOException
{
	String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
	String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
		
		AdminUsersPage adminuser=new AdminUsersPage(driver);
		adminuser.clickonadminuser();
		adminuser.search();
		
		
}

}

