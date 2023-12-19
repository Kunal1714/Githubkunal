package TestPack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	@Test(dataProvider="getdata") 
	public void carloan(String usesname, String password)
	{
		System.out.println("Carloan Login" + usesname);
		System.out.println("Carloan Password" + password);
	}

	@DataProvider
	public Object[][] getdata()
	{
		Object [][] Data = new Object [3][2];
		
		Data [0][0]= "UN1";
		Data [0][1]= "PW1";
		Data [1][0]= "UN2";
		Data [1][1]= "PW2";
		Data [2][0]= "UN3";
		Data [2][1]= "PW3";
		return Data;
		
		
				
		
				
		
	}
	
}
