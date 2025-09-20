package automationcore;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Constants.Contants;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ScreenShotUtilities;


public class Base {
	Properties prop;
	public    WebDriver driver;
	FileInputStream fs;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void intializeBrowser(String browser) throws Exception
	{
		prop=new Properties();
		fs=new FileInputStream(Contants.CONFIGFILE);
		prop.load(fs);
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
			 
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver()
			.clearResolutionCache()
			.forceDownload()
			.setup();
			
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new Exception("Invalid browser");
		}
		//driver.get("https://groceryapp.uniqassosiates.com/admin/login");//
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// implicitlyWait is a mthd to apply implicit wait,Duration is a class
	}
	@AfterMethod(alwaysRun=true)
	
	public void driverQuit(ITestResult iTestResult) throws IOException {

		if (iTestResult.getStatus() == ITestResult.FAILURE) {

			ScreenShotUtilities screenShot=new ScreenShotUtilities();
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
		driver.quit();

	

	}
	
}
