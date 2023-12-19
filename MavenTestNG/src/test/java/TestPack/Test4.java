package TestPack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {
	
	@Test (timeOut=4000) //timeout
	public void GetData()
	{
		System.out.println("This is GetData method");
	}
	
	@Test(enabled=false) //to turn off any particular test case
	public void GetData2()
	{System.out.println("This is GetData method 2");
	
	}
	
	@Test(dependsOnMethods={"GetData4"}) //if depending on other methods
	public void GetData3()
	{
		System.out.println("This is GetData method 3");
	}
	
	@Parameters({"Url"})
	@Test
	public void GetData4(String URL)
	{
		System.out.println("This is GetData method 4"+" "+ URL);
	}
	
}

	

