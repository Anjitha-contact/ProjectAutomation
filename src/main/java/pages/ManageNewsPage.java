package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")private WebElement managenewspage;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement addNewButton;
@FindBy(xpath="//textarea[@id='news']")private WebElement textBox;
@FindBy(xpath="//button[@type='submit']")private WebElement saveButton;

@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchNews;
@FindBy(xpath="//input[@class='form-control']")private WebElement searchTextBox;
@FindBy(xpath="//button[@name='Search']")private WebElement searchResult;
@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")private WebElement resetButton;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement heading;
@FindBy(xpath="//a[@class='page-link']")private WebElement searchpage;
@FindBy(xpath="//input[@class='form-control']")private WebElement searchtab;


public ManageNewsPage goToManageNewsPage()
{
	managenewspage.click();
	return this;
}
public ManageNewsPage newbutton()
{
	addNewButton.click();
	return this;
}
public ManageNewsPage enterNewsTitleInTextBox(String Newnews)
{
	textBox.sendKeys(Newnews);
	return this;
}
public ManageNewsPage clickOnSaveButton()
{
	saveButton.click();
	return this;
}
public ManageNewsPage clickOnSearchButton()
{
searchNews.click();	
return this;

}
public ManageNewsPage enterNewsTitleInSearchBox(String Newnews)
{
	searchTextBox.sendKeys(Newnews);
	return this;
}
public ManageNewsPage clickOnSearchResult()
{
	searchResult.click();
	return this;
}
public ManageNewsPage clickOnRestButton()
{
	resetButton.click();
	return this;
}
public boolean headingnews()
{
	return heading.isDisplayed();
}
public boolean searchnews()
{
	return searchpage.isDisplayed();
}
public boolean reseticon()
{
	return searchtab.isDisplayed();
}
}
