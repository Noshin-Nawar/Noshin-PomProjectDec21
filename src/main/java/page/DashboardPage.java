package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
//since a new page dashboard is here we define
	WebDriver driver;

	// constructor creation & passing the driver in this page
	public DashboardPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Customers')]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Add Customer')]") WebElement ADD_CUSTOMER_MENU_ELEMENT;
	
	
	
	
	public void validateDashboardPage(String dashboard) {
		
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(),dashboard,"Opss Wrong Page");
	}
	
	
	public void clickCustomerMenuButton() {
		
		CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickAddCustomerMenuButton() {
		
		ADD_CUSTOMER_MENU_ELEMENT.click();
		
	}
	
	
}