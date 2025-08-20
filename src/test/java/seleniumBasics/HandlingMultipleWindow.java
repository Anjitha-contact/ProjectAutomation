package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow  extends Base {
	
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstwindowHandle=driver.getWindowHandle();
		System.out.println(firstwindowHandle);
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here'] "));
		clickHere.click();
		
		Set<String>Handleid=driver.getWindowHandles();
		System.out.println(Handleid);
		
		Iterator<String>it=Handleid.iterator();
		// checking element in 
		while (it.hasNext())
		{
			
			String currentid =it.next();
			
			if(!currentid.equals(firstwindowHandle))
			{
				driver.switchTo().window(currentid);
				WebElement email=driver.findElement(By.name("emailid"));
				email.sendKeys("anjithacontact@gmail.com");
				WebElement submit=driver.findElement(By.name("btnLogin"));
				submit.click();
				
			}
			}
	}

	public static void main(String[] args) {
		
		HandlingMultipleWindow obj=new HandlingMultipleWindow();
		obj.intializeBrowser();
		obj.verifyMultipleWindow();
	}

}
