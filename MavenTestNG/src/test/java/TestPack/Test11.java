package TestPack;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test11 {
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is AfterMethod");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is BeforeClass");
	}
	
	@Test (groups= {"Smoke Testing"})
	public void test11()
	{
		System.out.println("First test 11");
	}
	
	@BeforeMethod
	public void beforemethod ()
	{
		System.out.println("This is BeforeMethod");
	}
	
	@BeforeSuite
	public void beforesuite()
	{System.out.println("This BeforeSuite");
	
	}
	@Test
	public void test12()
	{System.out.println("Seconf Test 12");
	
	
	}
	@Test
	public void test13()
	{System.out.println("Third Test 13");
	}
	

}
