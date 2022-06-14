package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	 WebDriver driver;
	 
	 public LoginPage(WebDriver driver) {
		 
		 this.driver= driver;
		 
	 }
		 
	 //Element List
	// WebElement USER_NAME_ELEMENT= driver.findElement(By.xpath("//*[@id=\"username\"]"));
	 //By USER_NAME_fIELD=By.xpath("//*[@id=\\\"username\\\"]");
	 
	 @FindBy(how= How.XPATH, using= "//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
	 @FindBy(how= How.XPATH, using= "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	 @FindBy(how= How.XPATH, using= "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_ELEMENT;
	 
	 //Intractable methods-pick any one individual or combined
	 //indivual for each
	 public void insertUserName(String username) {
		 USER_NAME_ELEMENT.sendKeys(username);
	 }
	 
	 public void insertPassWord(String password) {
		 
		 PASSWORD_ELEMENT.sendKeys(password);
	 }
	
	 public void clickSignInButton () {
		 SIGNIN_ELEMENT.click();
	 }
	 //combined method
   public void performLoginIn(String username,String password) {
		 
		 USER_NAME_ELEMENT.sendKeys(username);
		 PASSWORD_ELEMENT.sendKeys(password);
		 SIGNIN_ELEMENT.click();
		 
	 }
	 

}
