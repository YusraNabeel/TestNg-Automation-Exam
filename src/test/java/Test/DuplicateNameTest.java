package Test;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DuplicateName;
import Util.BrowserFactory;

public class DuplicateNameTest {
WebDriver driver;
	
	@Test
	public void CategoryShouldNotBeCreated() throws InterruptedException {
		driver =  BrowserFactory.init();
	
	
	DuplicateName duplicateAlert = PageFactory.initElements(driver, DuplicateName.class);
	duplicateAlert.AgaincheckBox("Yusra:)");
	duplicateAlert.category_name();
//	duplicateAlert.Alert_window();
	
	
}
	}