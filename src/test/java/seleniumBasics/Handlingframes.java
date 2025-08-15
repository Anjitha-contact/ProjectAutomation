package seleniumBasics;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingframes extends Base{
	
	public static void main(String[] args) {
	Handlingframes obj=new Handlingframes();
	obj.intializeBrowser();
	obj.frames();
		
	}
	
	
	public void frames()
	{
		//size() used to get total frames
		
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalFrame=driver.findElements(By.tagName("iframe"));
	  	System.out.println(totalFrame.size());
		
		//switchTo().frame() used to bring control of required frame
		
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		WebElement frameheading =driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		
		//switchTo().defaultContent() back to control
		driver.switchTo().defaultContent();
	}

	
}
