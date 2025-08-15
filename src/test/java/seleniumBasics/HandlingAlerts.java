package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("http://demoqa.com/alerts");
		WebElement simple=driver.findElement(By.id("alertButton"));
		simple.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();	
	}

	public void verifyConfirmAlert()
	{
		driver.navigate().to("http://demoqa.com/alerts");
		WebElement confirm=driver.findElement(By.id("confirmButton"));
		confirm.click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		
	}
	public static void main(String[] args) {
		
		HandlingAlerts obj=new HandlingAlerts();
		obj.intializeBrowser();
		obj.verifySimpleAlert();
		obj.verifyConfirmAlert();
				
		

	}

}
