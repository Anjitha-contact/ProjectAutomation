package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.Contants;
import automationcore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

import utilities.RandomDataUtility;

public class ManageNewsTest extends Base{
	
@Test
public void verifyWheatherUserIsAbleToAddNewNews() throws IOException
{
	String username = ExcelUtilities.getStringData(1, 0, "loginsheet");
	String password = ExcelUtilities.getStringData(1, 1, "loginsheet");
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
		
		
		boolean isHeadingDisplayed = news.headingnews();
	    Assert.assertTrue(isHeadingDisplayed,Contants.ADDNEWUSERERROR );
}
@Test
public void verifySearchNewNewsButton() throws IOException
{String username = ExcelUtilities.getStringData(1, 0, "loginsheet");
String password = ExcelUtilities.getStringData(1, 1, "loginsheet");
LoginPage login = new LoginPage(driver);
login.enterUserNameonUsernameField(username);
login.enterPasswordinPasswordField(password);
login.clickonRemeberMe();
login.clickSigin();

ManageNewsPage news=new ManageNewsPage(driver);
news.goToManageNewsPage();
news.clickOnSearchButton();

String Title=ExcelUtilities.getStringData(1,0,"ManageNewsPage");
news.enterNewsTitleInSearchBox(Title);
news.clickOnSearchResult();



//boolean isSearchPageDisplayed = news.searchnews();
//Assert.assertTrue(isSearchPageDisplayed,Contants.SEARCHNEWSNOTFOUND);

}




@Test
public void verifyResetBottonFunctionality() throws IOException
{

	String username = ExcelUtilities.getStringData(1, 0, "loginsheet");
	String password = ExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();	
		
		ManageNewsPage news=new ManageNewsPage(driver);
		news.goToManageNewsPage();
		news.clickOnRestButton();
		
		//boolean isSearchtabDisplayed = news.searchnews();
		//Assert.assertTrue(isSearchtabDisplayed,Contants.RESETBUTTONERROR);
		
}

}
