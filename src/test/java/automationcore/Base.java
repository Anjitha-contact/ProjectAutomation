package automationcore;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ScreenShotUtilities;


public class Base {
	public  WebDriver driver;
	
	@BeforeMethod
	
	public void intializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// implicitlyWait is a mthd to apply implicit wait,Duration is a class
	}
	@AfterMethod
	
	public void driverQuit(ITestResult iTestResult) throws IOException {

		if (iTestResult.getStatus() == ITestResult.FAILURE) {

			ScreenShotUtilities screenShot=new ScreenShotUtilities();
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
		//driver.quit();

	

	}
	
}
