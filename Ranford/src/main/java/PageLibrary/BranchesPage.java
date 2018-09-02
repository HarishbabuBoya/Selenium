package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class BranchesPage extends Base{
	
	public static WebElement newBranch_btn(WebDriver driver) {		
		return driver.findElement(getLocator("newBranch"));

	}
	
	public static WebElement branchName_txt(WebDriver driver) {
		return driver.findElement(getLocator("branchName"));

	}
	
	public static WebElement branchAddress1_txt(WebDriver driver) {
		return driver.findElement(getLocator("branch_address1"));

	}	
	
	public static WebElement zipcode_txt(WebDriver driver) {
		return driver.findElement(getLocator("branch_zipcode"));

	}
	
	public static WebElement cancel_btn(WebDriver driver) {
		return driver.findElement(getLocator("branch_cancelBtn"));

	}

}
