package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class LoginPage extends Base{
	
	public static WebElement username_textfield(WebDriver driver) {
		//return driver.findElement(By.name(read_OR("username_txt")));
		return driver.findElement(getLocator("username_txt"));
	}
	
	public static WebElement password_textfield(WebDriver driver) {
		return driver.findElement(getLocator("password_txt"));

	}
	
	public static WebElement login_button(WebDriver driver) {
		return driver.findElement(getLocator("login_btn"));
  
	}	

}
