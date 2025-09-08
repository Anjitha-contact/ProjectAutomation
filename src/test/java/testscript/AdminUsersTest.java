package testscript;



import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.GrocceryExcelUtilities;
import utilities.RandomDataUtility;

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
		
		String adminUserName=GrocceryExcelUtilities.getStringData(1, 0, "AdminuserPage");
	    String adminPassword=GrocceryExcelUtilities.getStringData(1,1, "AdminuserPage");
	    adminuser.enterUserNameonUserNameField(adminUserName);
		adminuser.enterPasswordInPasswordField(adminPassword);
		adminuser.selectUserType();
		adminuser.saveonAdminuser();
		
	    
		//RandomDataUtility random=new RandomDataUtility();
		//String adminUsername=random.createRandomUsername();
		//String adimPassword=random.createRandomPassword();
		
		
		
}
	@Test
public void verifywhetherUserIsableSearchOnNewUser() throws IOException
{
	String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
	String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
		
		
		AdminUsersPage adminuser=new AdminUsersPage(driver);
		String adminUserName=GrocceryExcelUtilities.getStringData(1, 0,"AdminuserPage");
		adminuser.clickonadminuser();
		adminuser.search();
		 adminuser.enterUserNameonSearchBox(adminUserName);
		adminuser.selectUsertypeSearch();
		adminuser.searchOnsearch();
		
		
		
}

}

