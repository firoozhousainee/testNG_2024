package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		googleSearchTest(); 
		
	}
	
	public static void googleSearchTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		searchPageObj.setTextInSearchBox("A B C D"); 
		searchPageObj.clickSearchButton(); 
		Thread.sleep(3000);
		 
		driver.close(); 
		
	}
	

}
