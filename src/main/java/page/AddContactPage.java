package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddContactPage extends BasePage{
	WebDriver driver;

	// constructor creation & passing the driver in this page
	public AddContactPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement FULL_NAME__ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")WebElement COMPANY__ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")WebElement EMAIL__ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")WebElement PHONE__ELEMENT;


	// for assert of this page
	public void validateAddContactPage(String addContact) {

		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContact, "Wrong Page!");
	}

	public void insertFullName(String fullName) {
		
		FULL_NAME__ELEMENT.sendKeys(fullName+ generateRandomNo(999));
	}
	
	public void selectCompany(String company) {
		
		selectFromDropdown(COMPANY__ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		
		EMAIL__ELEMENT.sendKeys(email+generateRandomNo(999));
		
		
	}

}
