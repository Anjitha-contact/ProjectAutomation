package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this);
		
	}
	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath ="//label[@for='remember']")private WebElement checkbox;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement invalid;

	public LoginPage enterUserNameonUsernameField(String admin)
	{
		usernamefield.sendKeys(admin);
		return this;
	}
	public LoginPage enterPasswordinPasswordField(String password)
	{
		passwordfield.sendKeys(password);
		return this;
	}
	public LoginPage clickonRemeberMe()
	{
		checkbox.click();
		return this;
	}
	public HomePage clickSigin()
	{
		signin.click();
		return new HomePage(driver);
	}
	public boolean isDashboardDisplayed()
	{
		return dashboard.isDisplayed();
	}
public boolean invalidmessage()
{
	
	return invalid.isDisplayed();
}
}
