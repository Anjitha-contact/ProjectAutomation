package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands  extends Base {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelement =new WebElementCommands ();
		webelement.intializeBrowser();
		webelement.handlingElements();
		
	
}
	 
public void handlingElements()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	// sendKey()
	
	WebElement msgBox =driver.findElement(By.xpath("//input[@id='single-input-field']"));
	msgBox.sendKeys("Input Form");
	
	//click
	WebElement bttn=driver.findElement(By.xpath("//button[@id='button-one']"));
	System.out.println(msgBox.isEnabled());
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(bttn));
	
	Wait<WebDriver>fluent=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
			.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	
	
	fluent.until(ExpectedConditions.elementToBeClickable(bttn));
	bttn.click();
	//is displayed
	System.out.println(bttn.isDisplayed());
	
	
	//getText() to print
	WebElement msg =driver.findElement(By.xpath("//div[@id='message-one']"));
	System.out.println(msg.getText());
	
	//clear()
	//msgBox.clear();
	
	//getCSSvalue() 
	System.out.println(bttn.getCssValue("background-color"));
	
	//getTagNvalueame()
	
	WebElement value =driver.findElement(By.id("value-a"));
	System.out.println(value.getTagName());
	
}
	
}

