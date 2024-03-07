package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;
public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearch(); 

	}	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		//chromeDriver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("This is going to be fun"); 
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step"); 
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		/*try {
		Thread.sleep(3000);
	} 	catch (InterruptedException e) {
		e.printStackTrace();
	}*/
		
		
	}
	
	
		
		
		
		
		
	}


