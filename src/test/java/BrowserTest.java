

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		/*WebDriver firefoxdriver = new FirefoxDriver(); 
		firefoxdriver.get("https:www.facebook.com");
		firefoxdriver.manage().window().maximize();
		firefoxdriver.close();*/
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.google.com");
		chromeDriver.manage().window().maximize();
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		chromeDriver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
		chromeDriver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("abcd");
		WebElement textBox = chromeDriver.findElement(By.xpath("//*[@id=\"APjFgb\"]"));
		
	
		
		//chromeDriver.close();
		//chromeDriver.quit(); 
	}	
	
	public static void googleSearch() {
		
		
		
	}

}
