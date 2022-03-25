package seleniumDemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumDemo.listentest.class)
public class testList {
	
	@Test
	public void sampletest()
	{
		
		System.out.println("this is sample test");
	}

}
