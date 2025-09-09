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

	public void enterUserNameonUsernameField(String admin)
	{
		usernamefield.sendKeys(admin);
	}
	public void enterPasswordinPasswordField(String admin)
	{
		passwordfield.sendKeys(admin);
	}
	public void clickonRemeberMe()
	{
		checkbox.click();
	}
	public void clickSigin()
	{
		signin.click();
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
