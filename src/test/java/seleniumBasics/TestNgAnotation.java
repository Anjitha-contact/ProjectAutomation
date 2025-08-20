package seleniumBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnotation {
	
	@Test
	public void testCase()
	{
		System.out.println("test case");
	}
	
@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
@AfterMethod
public void afterMethod()
{
	System.out.println("Aftermethod");
}
}
