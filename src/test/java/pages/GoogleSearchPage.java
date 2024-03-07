package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null; 
	
	// method to go to the google search text 
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element; 
	}
	
	// method to click on the search button 
	public static WebElement button_search(WebDriver driver) {
		
		element = driver.findElement(By.name("btnk"));
		return element; 
	}

}
