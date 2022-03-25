package seleniumDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browsertest {
	
	@Test
	@Parameters("browser")
	public void test(String browser)
	{
		if(browser.equals("chrome"))
		System.out.println("open chrome");
	
	
		else if (browser.equals("mozilla"))
		{
		System.out.println("open mozilla");
		}
	}
	

}
