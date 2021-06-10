package demo_selenium;

/*import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
*/
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchClass {

	 public static void googleSearch() {
		 String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", "D:\\PD\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("abcd");
			//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
			//driver.findElement(By.name("btnk")).click();
			WebElement button = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
			
			button.sendKeys(Keys.RETURN);
			driver.close();
			
			System.out.println("projectPath is "+projectPath);

	 }
}
