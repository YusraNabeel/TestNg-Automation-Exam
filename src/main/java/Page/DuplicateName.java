package Page;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DuplicateName {

	WebDriver driver;

	public void AddingCategoryAgain(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']")
	WebElement AddAgainData;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement createAgainCategory;
	@FindBy(how = How.XPATH, using = "/html/body")
	WebElement PopupWindow;

	// a[@href='javascript:history.back();']

	public void AgaincheckBox(String categoryNam) {
		AddAgainData.sendKeys(categoryNam);
	}

	public void category_name() throws InterruptedException {
		createAgainCategory.click();
		
	}
	
	
	String input = "";
	 public void Insidebody() {
		  
		  String expected = "The category you want to add already exists: " + input+ ".";
		  
		  String bodyText = PopupWindow.getText();
		  String bodyTextArry[] = bodyText.split("\n");
		  
		  String actual = bodyTextArry[0];
		  System.out.println("FirstLine: " + actual);
		  
		  Assert.assertEquals(actual, expected);
		  
	 }}  
//		public void EnteredNameExist() {
//			String beforeXpath = "/html/body/text()[1]";
//			String AfterXpath = ".";
//			
//			for (int i=1 ; i <= 15; i++) {
//				String addname = driver.findElement(By.xpath( beforeXpath + i + AfterXpath)).getText();
//				
//			}
//			
//			if (
////			System.out.println();
//		
//		}
		
//		String alertmsg = driver.switchTo().alert().getText();
//		System.out.println("===========" + alertmsg);
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
	

//	public void Alert_window(){
//		
//		AlertWindow.click();
//	}

