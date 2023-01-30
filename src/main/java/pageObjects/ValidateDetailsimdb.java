package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class ValidateDetailsimdb {

	public WebDriver driver ;

	public ValidateDetailsimdb(WebDriver Driver) {
		
		
		this.driver = Driver ;
		
	}
	
	By ReleaseDate1 = By.xpath("//a[contains(text(),\"Release date\")]/parent::li/div");
	By CountryName = By.xpath("//button[contains(text(),\"Country of origin\")]/parent::li/div") ;
	
	
	public String validateReleaseDate() {
		
		return	driver.findElement(ReleaseDate1).getText()  ;
			}
	
	public String validateCountryName() {
		
		return driver.findElement(CountryName).getText()  ;
			}
	

}
