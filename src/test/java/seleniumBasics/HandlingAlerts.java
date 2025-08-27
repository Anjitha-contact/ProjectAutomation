package seleniumBasics;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("http://demoqa.com/alerts");
		WebElement simple=driver.findElement(By.id("alertButton"));
		//Clicks the button
		simple.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();	
	}

	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirm=driver.findElement(By.id("confirmButton"));
		
		confirm.click();
		Alert alert=driver.switchTo().alert();//focus from the WebPage to the alert popup.
		alert.dismiss();
		
	}
	

	public void promptAlert()
	{
		driver.navigate().to("http://demoqa.com/alerts");
		WebElement prompt=driver.findElement(By.id("promtButton"));
		prompt.click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("Anji");
		alert.accept();
		
	}
public static void main(String[] args) {
		
		HandlingAlerts obj=new HandlingAlerts();
		obj.intializeBrowser();
		obj.verifySimpleAlert();
		//obj.verifyConfirmAlert();
		obj.promptAlert();
				

	}
}
