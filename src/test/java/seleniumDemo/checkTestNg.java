package seleniumDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkTestNg {
	
	
	
	
	
	@BeforeSuite
	public void beforesuite()

	{
		System.out.println("before test suite");
		
	}
	
	@BeforeClass
	public void beforeclass()

	{
		System.out.println("before test class");
		
	}
	
	
	
	
	
	
	@BeforeTest
	public void beforetest1()
	{
		System.out.println("before test case");
		
	}
	@BeforeTest
	public void beforetest2()
	{
		System.out.println("before test case2");
		
	}
	
	@AfterTest
	public void aftertest1()
	
	{
		System.out.println("after test case");
		
	}
	@AfterClass
	public void afterclass()
	{
		
		System.out.println(" after class run in checktestng");
	}
	
	@AfterTest
	public void aftertest2()
	
	{
		System.out.println("after test case2");
		
	}
	@BeforeMethod
	public void beforemethod1()
	{
		System.out.println("before test method function");
	}
	
	@BeforeMethod
	public void beforemethod2()
	{
		System.out.println("before test method2 function");
	}
	
	@AfterMethod
	public void Aftermethod1()
	{
		System.out.println("After test method function");
	}
	
	@Test
	public void test1()
	{
		
		System.out.println(" test1 running");
	}

	
	@Test//(groups= {"smoke"})
	public void test2()
	{
		
		System.out.println(" test2 running");
	}
	
	@Test
	public void tepst3()
	{
		
		System.out.println(" test3 running");
	}
}
