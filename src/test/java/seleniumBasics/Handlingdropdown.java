package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown extends Base {

	public void handlingdropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown= driver.findElement(By.id("dropdowm-menu-1")); //webelement naming to perform action 
		Select select =new Select(dropdown); 
		
		//select.selectByIndex(2);
		//select.selectByValue("python");
		
		// by text (< text in black>
		
		select.selectByVisibleText("SQL");
		
	}
	public void handlingcheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement checkbox1 =driver.findElement(By.xpath("//input[@value=\'option-1\']"));
		checkbox1.click();
		WebElement checkbox2=driver.findElement(By.xpath("//input[@value=\'option-2\']"));
		checkbox2.click();
		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox2.isSelected());
		
	}
	public void handlingradioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobtn1= driver.findElement(By.xpath("//input[@value=\'green\']"));
		radiobtn1.click();
		WebElement radiobtn2=driver.findElement(By.xpath("//input[@value=\'purple\']"));
		radiobtn2.click();
		
	}
	
 public static void main(String[] args) {
	 Handlingdropdown handling=new Handlingdropdown();
	 handling.intializeBrowser();
	 //handling.handlingdropdown();
	 handling.handlingcheckbox();
	 //handling. handlingradioButton();
	 
		
 }
 
}
	

	


