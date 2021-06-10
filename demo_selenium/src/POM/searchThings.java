package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchThings {
	
	static WebDriver driver = null;
	
	public static void searchTextBox() {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	}
	
	public static void searchButton() {
		WebElement button = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
	}

}
