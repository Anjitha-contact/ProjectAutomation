package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base {
	
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		
		// to get data of entire table
		//WebElement table=driver.findElement(By.id("dataTable"));
		//System.out.println(table.getText());
		
		// to get data of a particular row in the table
		WebElement rowdata=driver.findElement(By.xpath("table[@id=dataTable']/tbody/tr[12]"));
		System.out.println(rowdata.getText());
		
	}

public static void main(String[] args) {
    
	 HandlingTables obj =new  HandlingTables();
	 obj.intializeBrowser();
	 obj.verifyTable();
	 
	
	}

}
