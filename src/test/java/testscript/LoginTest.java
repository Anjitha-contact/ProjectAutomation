package testscript;

<<<<<<< HEAD


import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.GrocceryExcelUtilities;

public class LoginTest extends  Base{
	
	@Test(priority=1,description ="sucessful user login with valid credential")
	public void verifyLoginWithValidCredentials() throws IOException {
		String username = GrocceryExcelUtilities.getStringData(1, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(1, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();

	}

	@Test(priority=2,description ="sucessful user login with valid password")
	public void verifyLoginWithaInvalidUsernameAndValidPassword() throws IOException {
		String username = GrocceryExcelUtilities.getStringData(2, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(2, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
	}
	
	@Test(priority=3,description ="sucessful user login with valid username")
	public void verifyLoginWithValidUsernameAndInvalidPassword() throws IOException {

		String username = GrocceryExcelUtilities.getStringData(3, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(3, 1, "loginsheet");
	
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
	}
	@Test(priority=4,description ="sucessful user login with invalid credential")
	public void verifyLoginWithInvalidUsernameAndInvalidPassword() throws IOException
	{
		String username = GrocceryExcelUtilities.getStringData(4, 0, "loginsheet");
		String password = GrocceryExcelUtilities.getStringData(4, 1, "loginsheet");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameonUsernameField(username);
		login.enterPasswordinPasswordField(password);
		login.clickonRemeberMe();
		login.clickSigin();
	}
		
=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.TestNGBase;

public class LoginTest extends TestNGBase {

	@Test
	public void verifyLoginWithValidCredentials() {
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}

	@Test
	public void verifyLoginWithaInvalidUsernameAndValidPassword() {
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("baab");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

	}

	@Test
	public void verifyLoginWithValidUsernameAndInvalidPassword() {
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("passwrd");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

	}

	@Test
	public void verifyLoginWithInvalidUsernameAndInvalidPassword() {
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("baab");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("passwrd");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

	}

>>>>>>> b94f730fb8add2d398aac6b777116b3f17ddd9a8
}
