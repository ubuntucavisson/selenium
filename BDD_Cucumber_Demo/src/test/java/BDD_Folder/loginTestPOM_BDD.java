package BDD_Folder;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class loginTestPOM_BDD {
	
	WebDriver driver;
	
	By txt_param = By.name("q");
	//By txt_param2 = null;
	By searchBtn = By.name("btnK");

	public loginTestPOM_BDD(WebDriver driver) {
		this.driver = driver;
	}
	
	public void txt_parameter(String text) {
		//driver.findElement(By.name("q")).sendKeys(txt_param);
		driver.findElement(txt_param).sendKeys(text);
	}
	
	public void ClickButton() {
		driver.findElement(searchBtn).click();
	}
}
