package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;

import utilities.GrocceryExcelUtilities;
import utilities.RandomDataUtility;

public class ManageNewsTest extends Base{
	
@Test
public void verifyWheatherUserIsAbleToAddNewNews() throws IOException
{
	String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
	String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();	
		
		ManageNewsPage news=new ManageNewsPage(driver);
		RandomDataUtility random=new RandomDataUtility();
		String title=random.createRandomText();
		news.goToManageNewsPage();
		news.newbutton();
		
		//String Title=GrocceryExcelUtilities.getStringData(1,0,"ManageNewsPage");
		news.enterNewsTitleInTextBox(title);
		news.clickOnSaveButton();
		
}
@Test
public void verifySearchNewNewsButton() throws IOException
{String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
LoginPage login = new LoginPage(driver);
login.enterUserNameonUsernameField(username);
login.enterPasswordinPasswordField(password);
login.clickonRemeberMe();
login.clickSigin();

ManageNewsPage news=new ManageNewsPage(driver);
news.goToManageNewsPage();
news.clickOnSearchButton();

String Title=GrocceryExcelUtilities.getStringData(1,0,"ManageNewsPage");
news.enterNewsTitleInSearchBox(Title);
news.clickOnSearchResult();
}
@Test
public void verifyResetBottonFunctionality() throws IOException
{

	String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
	String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();	
		
		ManageNewsPage news=new ManageNewsPage(driver);
		news.goToManageNewsPage();
		news.clickOnRestButton();
}

}
