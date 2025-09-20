package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[@data-toggle='dropdown']")private WebElement adminicon;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")private WebElement logouticon;
	
	public HomePage clickonadminicon()
	{
		adminicon.click();
		return this;
	}
	public LoginPage clickonlogouticon()
	{
		logouticon.click();
		return new LoginPage(driver);
	}
	public boolean adminDisplay()
	{
		return adminicon.isDisplayed();
	}
}
