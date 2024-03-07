package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
	public static void main(String[] args) {
    	
    	
    	// create extentReports and attach reporters
    	ExtentReports extent = new ExtentReports();
    	ExtentSparkReporter sparkReprt = new ExtentSparkReporter("Spark.html");  
    	
    	
    	// create a toggle for the given test, adds all log events under it
    	ExtentTest test = extent.createTest("Google search Test one", "this si a test to validate google search funtionality");
    	
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		test.log(Status.INFO, "Starting Test Case");
		driver.get("https:www.google.com");
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("kos binit");
		test.pass("Entered text in Search box");
		
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		test.pass("Pressed keyboard enter key"); 
		
		driver.close();
		driver.quit();
		test.pass("Closed the browser");
		
		test.info("Test Completed"); 
		
		extent.flush();
    }
}

