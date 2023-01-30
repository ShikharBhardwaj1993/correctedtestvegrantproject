package Utilities;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.BeforeTest;
//import org.testng.*;
//import org.testng.annotations.Test;

public class Testbase {

	public WebDriver driver;
			
	//@Parameters("urltype")
	public WebDriver setbase(String urltype) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\HP\\eclipse-workspace\\TestVagrant\\src\\test\\resources\\chromedriver.exe");
		
		driver = new ChromeDriver() ;
		
	if(urltype.equalsIgnoreCase("wiki")) {	
		
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		
		  }
	
	else if(urltype.equalsIgnoreCase("imdb")) {
		
		driver.get("https://www.imdb.com/title/tt9389998/?ref_=fn_al_tt_1");
	
	}	return driver ;  
		
		}	
	
	}

	
	









