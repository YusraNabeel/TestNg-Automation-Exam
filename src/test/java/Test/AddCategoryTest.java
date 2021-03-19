package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddCategory;
import Util.BrowserFactory;

public class AddCategoryTest {

	WebDriver driver;
	
	@Test
	public void CategoryShoulBeCreated() {
		driver =  BrowserFactory.init();
		
		AddCategory addCategory = PageFactory.initElements(driver, AddCategory.class);
		addCategory.checkBox("Yusra:)");
		addCategory.category_name();
		
	}
}
