package seleniumBasics;

import org.openqa.selenium.By;

public class Locaters extends Base {


	public void handlingLocaters()
	{
		driver.findElement(By.id("button-one"));//id attribute
		driver.findElement(By.className("btn btn-primary"));

		driver.findElement(By.tagName("input"));

		driver.findElements(By.tagName("input"));

		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		driver.findElement(By.cssSelector("button[id='button-one']"));

		//html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button absolute path
		
driver.findElement(By.xpath("//input[@id='single-input-field']"));
driver.findElement(By.xpath("//button[text()='Show Message']"));
driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
driver.findElement(By.xpath("//[@id='button-one' and @type='button']"));
driver.findElement(By.xpath("//[@id='button-one' or @type='button']"));

//parent

driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
// child
driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
//following

driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
//preceding

driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));

driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));

driver.findElement(By.xpath("//div[@class='card']//descendant::div"));


}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
