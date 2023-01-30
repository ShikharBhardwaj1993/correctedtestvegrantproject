package TestScripts;

import Utilities.Testbase;
import pageObjects.ValidateDetailsimdb;


//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class TS002_imdb  {

	Testbase testbase = new Testbase() ;
	WebDriver Driver = testbase.setbase("imdb") ;
	ValidateDetailsimdb val  =new ValidateDetailsimdb(Driver) ;
	
	@Test
	public void validateReleaseDateatIMDB() {
		
		String Value1 = val.validateReleaseDate() ;
		
		Assert.assertEquals("dasdsds",Value1);
			
		}

	@Test
	public void validateCountrynameatIMDB() {
		
		String Value2 = val.validateCountryName() ;
		
		Assert.assertEquals("India",Value2);
			
		}

	@AfterMethod
	public void closewindow() {
		
		Driver.quit();
		
		}

	}

