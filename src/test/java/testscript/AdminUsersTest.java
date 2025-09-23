package testscript;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.Contants;
import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.AdminUsersPage;
import utilities.ExcelUtilities;


public class AdminUsersTest  extends Base {
	
	HomePage homepage;
	AdminUsersPage adminUserpage;
	
	
	
	@Test
	public void verifywhetherUserIsableToClickOnAddNewUser() throws IOException
	{
		String username = ExcelUtilities.getStringData(1, 0, "loginsheet");
	    String password = ExcelUtilities.getStringData(1, 1, "loginsheet");
		
		
		LoginPage login = new LoginPage(driver);
		//login.enterUserNameonUsernameField(username);
		//login.enterPasswordinPasswordField(password);
		login.enterUserNameonUsernameField(username).enterPasswordinPasswordField(password);
		//login.clickonRemeberMe();
		//login.clickSigin();
		homepage=login.clickSigin();
		
		
		
		AdminUsersPage adminuser=new AdminUsersPage(driver);
		adminuser.clickonadminuser();
		adminuser.newuser();
		
		String adminUserName=ExcelUtilities.getStringData(1, 0, "AdminuserPage");
	    String adminPassword=ExcelUtilities.getStringData(1,1, "AdminuserPage");
	    
	    //adminuser.enterUserNameonUserNameField(adminUserName);
		//adminuser.enterPasswordInPasswordField(adminPassword);
	    adminuser.newuser().enterUserNameonUserNameField(adminUserName).enterPasswordInPasswordField(adminPassword);
		adminuser.selectUserType();
		adminuser.saveonAdminuser();
		
		
	    
		//RandomDataUtility random=new RandomDataUtility();
		//String adminUsername=random.createRandomUsername();
		//String adimPassword=random.createRandomPassword();
		
	    boolean isHeadlineDisplayed = adminuser.userpageHeadline();
	    Assert.assertTrue(isHeadlineDisplayed,Contants.ADDNEWUSERERROR);
		
}
	@Test(retryAnalyzer=retryAnalyzer.Retry.class)
public void verifywhetherUserIsableSearchOnNewUser() throws IOException
{
	String username = ExcelUtilities.getStringData(1, 0, "loginsheet");
	String password = ExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username).enterPasswordinPasswordField(password).clickonRemeberMe().clickSigin();
		//login.enterPasswordinPasswordField(password);
		//login.clickonRemeberMe();
		//login.clickSigin();
		
		
		AdminUsersPage adminuser=new AdminUsersPage(driver);
		String adminUserName=ExcelUtilities.getStringData(1, 0,"AdminuserPage");
		
		adminuser.clickonadminuser().search().enterUserNameonSearchBox(adminUserName).selectUsertypeSearch().searchOnsearch();
		//adminuser.search();
		 //adminuser.enterUserNameonSearchBox(adminUserName);
		//adminuser.selectUsertypeSearch();
		//adminuser.searchOnsearch();
		
		boolean actioniconisDisplayed=adminuser.userAction();
		Assert.assertTrue(actioniconisDisplayed,Contants.ADDNEWUSERERROR );
		
		
}

}

