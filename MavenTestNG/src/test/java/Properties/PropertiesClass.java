package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesClass {
	
	@Test
	public void Data() throws IOException
	{
		//to read data from properties file(external file) create an object for properties class
		Properties prop = new Properties ();
		
		//to read in properties file
		FileInputStream fis = new FileInputStream ("C:\\Users\\kpate\\OneDrive\\Documents\\JavaTraning\\MavenTestNG\\src\\test\\java\\Properties\\Data.properties");
		prop.load(fis);	 
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("username"));
		
		//inorder to modify value in property file
		
		prop.setProperty("username", "Patel");
		System.out.println(prop.getProperty("username"));
		
		//to write in property file
		FileOutputStream Fos = new FileOutputStream ("C:\\Users\\kpate\\OneDrive\\Documents\\JavaTraning\\MavenTestNG\\src\\test\\java\\Properties\\Data.properties");
		prop.store(Fos, null);
		
	}

}
