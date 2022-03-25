package seleniumDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checktest3 {

	
	@BeforeClass
	public void beforeclass()

	{
		System.out.println("before test class in checktest3");
		
	}
	
	@Test//(groups= {"smoke"})
	public void checktest3()
	{
		
		System.out.println(" check test3 running");
	}
	
	@Test
	public void checktest133()
	{
		
		System.out.println(" check test1233 running");
	}
	
	@AfterClass
	public void test3afterclass()
	{
		
		System.out.println(" after class run");
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test case from checktest3");
		
	}
	
	

	@AfterTest
	public void aftertest()
	{
		System.out.println("after test case from checktest3");
		
	}
	
	@Test(groups= {"smoke"})
	public void checktest31()
	{
		System.out.println("inside the test checktest31");
	}
}
