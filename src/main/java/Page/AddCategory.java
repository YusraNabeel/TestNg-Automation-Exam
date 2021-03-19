package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory {

	WebDriver driver;
	
	public void AddingCategory (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']")
	WebElement AddData;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement createCategory;
	
	
	public void checkBox(String categoryName) {
		AddData.sendKeys(categoryName);
	}
	
	public void category_name() {
		createCategory.click();
		
	}
}
