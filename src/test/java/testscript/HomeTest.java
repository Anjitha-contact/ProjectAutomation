package testscript;
import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.GrocceryExcelUtilities;

public class HomeTest extends Base{
	
@Test
	public void verifywhetherUserIsableToLogOut() throws IOException {
	
		    String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
			String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
			LoginPage login = new LoginPage(driver);
			login.enterUserNameonUsernameField(username);
			login.enterPasswordinPasswordField(password);
			login.clickonRemeberMe();
			login.clickSigin();
			HomePage homepage=new HomePage(driver);
			homepage.clickonadminicon();
			homepage.clickonlogouticon();
			
			
	}

}
