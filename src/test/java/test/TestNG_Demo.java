package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {
	static WebDriver driver = null;
	
	@BeforeTest
	public void setupTst() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	@Test
	public static void googleSearch() {
	
	driver.get("https://google.com");
	
	driver.findElement(By.name("q")).sendKeys("Automation step by step"); 
	
}
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed Successfully");
	}

}