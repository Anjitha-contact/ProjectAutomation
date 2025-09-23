package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	public void selectUserType(WebElement dropdown, int index)
	{
		Select select=new Select(dropdown);
		select.selectByIndex(2);
	}
	public void selectDropdownWithValue(WebElement element, String value) //In Admin pages
	{
		Select object = new Select(element);
		object.selectByValue(value);
	}
	public void scrollUpandDown(WebDriver driver, int xAxis, int yAxis)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(xAxis,yAxis)", "");
	}

	public void mouseHoverOnElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void dragAndDropAnElement(WebDriver driver, WebElement dragMe, WebElement dropMe) {
		Actions action = new Actions(driver);
		action.dragAndDrop(dragMe, dropMe).build().perform();
	}
	
	
}
