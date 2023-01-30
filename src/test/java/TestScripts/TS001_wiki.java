package TestScripts;

import Utilities.Testbase;
import pageObjects.ValidateDetailswiki;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class TS001_wiki  {

	Testbase testbase = new Testbase() ;
	WebDriver Driver = testbase.setbase("wiki") ;
	ValidateDetailswiki val  =new ValidateDetailswiki(Driver) ;
	
	@Test
	public void validateReleaseDateatWIKI() {
		
		String Value1 = val.validateReleaseDate() ;
		
		Assert.assertEquals("dasdsds",Value1);
			
		}

	@Test
	public void validateCountrynameatWIKI() {
		
		String Value2 = val.validateCountryName() ;
		
		Assert.assertEquals("India",Value2);
			
		}

	@AfterMethod
	public void closewindow() {
		
		Driver.quit();
		
		}

	}

