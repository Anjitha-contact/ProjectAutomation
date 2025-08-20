package seleniumBasics;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions  extends Base{
	
	
	public void verifyrightClick()
	{
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		//Actions is a predefined class  performing mouse actions
		Actions action =new Actions(driver);
		action.contextClick(home).build().perform();	
		//contextClick() method from Action class to perform click action 
			
	}
	public void mousehaover()
	{
		WebElement others=driver.findElement(By.id("others"));
		Actions action=new Actions(driver);
		action.moveToElement(others).build().perform();
	
	}
	public void verifydragAnddrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drope=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
	action.dragAndDrop(drag, drope).build().perform();
	}
	public void verifyKeyboardaction() throws AWTException
	{
		//Robot is predefined class used to perform Keyboard actions
		//no need to pass driver
		Robot robot=new Robot();
		//KeyPress used to press a key
		//KeyEvent is class contain keys
		//VK-Virtual Key
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		
	}

	public static void main(String[] args) {
		
		HandlingActions obj=new HandlingActions();
		obj.intializeBrowser();
		//obj.verifyrightClick();
		//obj.mousehaover();
		//obj.verifydragAnddrop();
		try {
			obj.verifyKeyboardaction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
