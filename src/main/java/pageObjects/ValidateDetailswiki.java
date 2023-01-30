package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class ValidateDetailswiki {

	public WebDriver driver ;

	public ValidateDetailswiki(WebDriver Driver) {
		
		
		this.driver = Driver ;
		
	}
	
	By ReleaseDate1 = By.xpath("//div[contains(text(),'Release date')]/parent::th/following-sibling::td");
	By CountryName = By.xpath("//th[contains(text(),'Country')]/following-sibling::td") ;
	
	
	public String validateReleaseDate() {
		
		return	driver.findElement(ReleaseDate1).getText()  ;
			}
	
	public String validateCountryName() {
		
		return driver.findElement(CountryName).getText()  ;
			}
	
	
	











}
