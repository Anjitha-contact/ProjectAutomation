package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	public WebDriver driver;
	
public AdminUsersPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")private WebElement adminuserbutton;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement addnewusericon;
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchicon;
@FindBy(xpath="//input[@id='username']")private WebElement username;
@FindBy(xpath="//input[@id='password']")private WebElement password;
@FindBy(xpath="//select[@id='user_type']")private WebElement usertype;
@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger' and @name='Create']")private WebElement save;
@FindBy(xpath="//input[@class='form-control']") private WebElement searchuser;
@FindBy(xpath="//select[@name='ut']")private WebElement selectusertype;
@FindBy(xpath="//button[@name='Search']")private WebElement search;
@FindBy(xpath="//h1[@class='m-0 text-dark']")private WebElement headline;
@FindBy(xpath="//th[@style='width:18%']")private WebElement actionicon;

public void clickonadminuser()
{
	adminuserbutton.click();
}
public void newuser()
{
	addnewusericon.click();
}
public void enterUserNameonUserNameField(String Anjitha)
{
	username.sendKeys(Anjitha);
}
public void enterPasswordInPasswordField(String anji)
{
	password.sendKeys(anji);
}
public void selectUserType()
{
	Select select=new Select(usertype);
	select.selectByIndex(2);
}
public void enterUserNameonSearchBox(String Anjitha)
{
	searchuser.sendKeys(Anjitha);
}
public void selectUsertypeSearch()
{
	Select select=new Select(selectusertype);
	select.selectByIndex(2);
}
public void search()
{
	searchicon.click();
}
public void searchOnsearch()
{
	search.click();
}
public void saveonAdminuser()
{
	save.click();
}
public boolean userpageHeadline()
{
	return headline.isDisplayed();
}
public boolean userAction()
{
	return actionicon.isDisplayed();
	
}
}  