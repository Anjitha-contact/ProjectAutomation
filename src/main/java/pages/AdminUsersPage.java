package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PageUtility;

public class AdminUsersPage {
	public WebDriver driver;
	private WebDriverWait wait;
	
public AdminUsersPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

public AdminUsersPage clickonadminuser()
{

	adminuserbutton.click();
	return this;
}
public AdminUsersPage newuser()
{
	addnewusericon.click();
	return this;
}
public AdminUsersPage enterUserNameonUserNameField(String Anjitha)
{
	username.sendKeys(Anjitha);
	return this;
	
}
public AdminUsersPage enterPasswordInPasswordField(String anji)
{
	password.sendKeys(anji);
	return this;
	
}
public AdminUsersPage selectUserType()
{
	PageUtility page=new PageUtility();
	page.selectUserType(usertype, 2);
	return this;
	//call it from page class
	//Select select=new Select(usertype);
	//select.selectByIndex(2);
}
public AdminUsersPage enterUserNameonSearchBox(String Anjitha)
{
	searchuser.sendKeys(Anjitha);
	return this;
}
public AdminUsersPage selectUsertypeSearch()
{
	Select select=new Select(selectusertype);
	select.selectByIndex(2);
	return this;
}
public AdminUsersPage search()
{
	searchicon.click();
	return this;
}
public AdminUsersPage searchOnsearch()
{
	search.click();
	return this;
}
public AdminUsersPage saveonAdminuser()
{
	save.click();
	return this;
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