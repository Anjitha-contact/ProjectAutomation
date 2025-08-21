package testscript;

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

}
