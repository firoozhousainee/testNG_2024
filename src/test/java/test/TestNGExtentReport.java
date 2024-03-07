package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExtentReport {
	
	
	
	// create extentReports and attach reporters
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter sparkReprt = new ExtentSparkReporter("Spark.html"); 
	
	WebDriver driver; 
	
	@BeforeTest
	public void BrowserLaunch() {
		sparkReprt.config().setTheme(Theme.DARK);
		sparkReprt.config().setDocumentTitle("MyReport");
		extent.attachReporter(sparkReprt);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get("https://www.google.com");
		
	}
	@AfterTest
	public void teardown() {
		
		extent.flush();
		driver.quit();
	}
	@Test
		public void Testcase_001() {
		ExtentTest test = extent.createTest("Verify the pagetitle").assignAuthor("Firooz").
				assignCategory("Functional test cases").assignDevice("Windows");
		test.info(" I am capturing the page title");
		String pagetitle = driver.getTitle();
		test.info("capture page title as: " + pagetitle);
		if(pagetitle.equals("Google")) {
			test.pass("Page title is verified: title captured " + pagetitle);
		} else {
			test.fail("Page title is not matched with expected results : " +pagetitle); 
		}
		
	}

}
