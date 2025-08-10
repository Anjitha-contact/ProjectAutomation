package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver; // WebDriver is a interface, interface initialization. 
	
	public void intializeBrowser()
	{
		driver=new ChromeDriver(); //creating object for Browser class
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();// code for maximize
	}
public void closeAndQuit()
{
	//driver.close(); used for single window
	//driver.quit(); used for close multiple window
}
	public static void main(String[] args) {
		Base base=new Base();
		base.intializeBrowser();
		base.closeAndQuit();

	}

} 

 