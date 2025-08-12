package seleniumBasics;

public class BrowseCommand  extends Base{

	

	public void handlingBrowsercommand()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String handleId =driver.getWindowHandle();
		System.out.println(handleId);//to get handle id
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);  
	}
public void navigationCommand()
{
	driver.navigate().to("https://www.amazon.in/");// to navigate different webSite
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
BrowseCommand br =new BrowseCommand();
br.intializeBrowser();
br.handlingBrowsercommand();
br.navigationCommand();

	}

}
