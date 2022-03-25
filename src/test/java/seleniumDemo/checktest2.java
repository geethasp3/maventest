package seleniumDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checktest2 {
	
	@BeforeTest
	public void beforechecktest1()
	{
		System.out.println("before check test case");
		
	}
	
	@BeforeMethod
	public void beforecheckmethod1()
	{
		System.out.println("before  check test method function");
	}
	
	@Test
	public void checktest1()
	{
		
		System.out.println(" check test1 running");
	}

	@BeforeSuite
	public void checkbeforesuite()

	{
		System.out.println("check before test suite");
		
	}
	
	@AfterSuite
	public void checkaftersuite()

	{
		System.out.println("check after test suite");
		
	}
	
	@Test//(groups= {"smoke"})
	public void test2()
	{
		
		System.out.println(" test2 running");
	}
	

}
