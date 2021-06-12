package extentReport_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo_TestNG {

	private static WebDriver driver = null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("TestNGReport.html");
		extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "D:\\PD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void test1() {
		driver.get("https://google.com");
		
        ExtentTest test = extent.createTest("MyFirstNGTest", "TestNG description");
        test.pass("Website opened");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("abcd");
		test.pass("Keyword entered");
		//test.log(Status.INFO, "Entered keyword");
		
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnk")).click();
		WebElement button = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
		button.sendKeys(Keys.RETURN);
		test.pass("Clicked on search");
        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        //test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
	@Test
	public void test2() {
		driver.get("https://google.com");
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("My2ndNGTest", "TestNG description");
        test.pass("Website opened 2nd");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.pass("This is 2nd test");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("xyz");
		test.pass("Keyword entered");
		//test.log(Status.INFO, "Entered keyword");
		
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnk")).click();
		WebElement button = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
		button.sendKeys(Keys.RETURN);
		test.pass("Clicked on search");
        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        //test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
		System.out.println("Browser closed:");
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
