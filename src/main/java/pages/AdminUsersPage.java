package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

public void clickonadminuser()
{
	adminuserbutton.click();
}
public void newuser()
{
	addnewusericon.click();
}
public void search()
{
	searchicon.click();
}
}  