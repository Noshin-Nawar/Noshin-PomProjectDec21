package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;


public class loginTest {

	WebDriver driver;
	
	
	
	@Test
	public void validUserShouldAbleToLogIn() {
		
		//create object //by name of the class
		
		driver= BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassWord("abc123");
		loginPage.clickSignInButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		
		
		
		BrowserFactory.tearDown();
		
		
	}
	
	
	
}
