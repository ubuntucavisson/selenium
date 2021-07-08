package BDD_Folder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver =null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser Open");
		System.setProperty("webdriver.chrome.driver", "D:\\PD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Driver Initiated");
		driver.navigate().to("https://www.google.com");
	}

	@When("^user enters (.*) in search textbox$")
	public void user_enters_text_in_search_text_box(String text) {
		System.out.println("Enter Text");
		driver.findElement(By.name("q")).sendKeys(text);		
	}

	@And("user hits enter")
	public void user_hits_enter() {
	    System.out.println("Hit Enters");
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
		System.out.println("Search Results");
		
		driver.close();
		driver.quit();
	}


}
