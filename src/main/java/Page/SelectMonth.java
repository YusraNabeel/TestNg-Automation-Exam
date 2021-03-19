package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SelectMonth {

	WebDriver driver;
	
	public SelectMonth (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement Month;
	
	public void validatemonths() {

		Select select = new Select(Month);
		select.getOptions();

		for (WebElement element : select.getOptions()) {
			System.out.println(element.getText());
		}
}}

