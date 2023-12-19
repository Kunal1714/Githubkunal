package TestPack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test (groups= {"Smoke Testing"})
	public void Test21()
	{
		System.out.println("First test 21");
	}
	
	@BeforeTest
	public void beforetest()
	{System.out.println("This is BeforeTest");
	
	}
	
	@Test
	public void test22()
	{System.out.println("Seconf Test 22");
	
	
	}
	@Test
	public void test123()
	{System.out.println("Third Test 23");
	}


}
