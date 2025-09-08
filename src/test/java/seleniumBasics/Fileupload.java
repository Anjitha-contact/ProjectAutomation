package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fileupload extends Base{
	
	public void fileuploadUsingSendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement file=driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("C:\\Users\\Abhijeeth\\git\\Selenium-Testing\\AutomationCourse\\src\\main\\resources\\13 (1).pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement bttn=driver.findElement(By.id("submitbutton"));
		bttn.click();
		
	}
	
	public void fileuploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
  WebElement bttn=driver.findElement(By.xpath("//a[@id='pickfiles']"));
  bttn.click();
  
  StringSelection s=new StringSelection("C:\\Users\\Abhijeeth\\git\\Selenium-Testing\\AutomationCourse\\src\\main\\resources\\13 (1).pdf");
  //  StringSelection is a class to copy path
  
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// s - transferable content, null no ownership
		Robot robot=new Robot();
		robot.delay(2500);// waiting time
		robot.keyPress(KeyEvent.VK_ENTER); // press enter
		robot.keyRelease((KeyEvent.VK_ENTER));//release enter
		robot.keyPress(KeyEvent.VK_CONTROL);  // control press
		robot.keyPress(KeyEvent.VK_V);  // v press
		robot.keyRelease(KeyEvent.VK_CONTROL); //release control
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	} 
		 

	public static void main(String[] args) {
		
		Fileupload upload =new Fileupload();
		upload.intializeBrowser();
		
		upload.fileuploadUsingSendkeys();
		
		try {
			upload.fileuploadUsingRobot();
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
