package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends pageBase {

	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="email")
	WebElement emailText;
	
	@FindBy(id="pass")
	WebElement passwordText;
	
	
	@FindBy(name="login")
	WebElement loginBTN;
	
	@FindBy(linkText ="Forgotten password?")
	WebElement forgetPasswordLink;
	
	@FindBy(id="u_0_v")
	WebElement createNewAccountBTN1;
	
	//@FindBy(css="a#_42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")
	@FindBy(id="open-registration-form-button")
	WebElement createNewAccountBTN;
	
	public void userLogin(String email,String password) {
		
		setTextElement(emailText, email);
		setTextElement(passwordText, password);
		clickButton(loginBTN);
		
	}
	
	public void openLogin() {
		
		driver.navigate().to("www.facebook.com");
		
		
	}
	
public void openSignup() {
		
		driver.navigate().to("www.facebook.com/signup");
		
		
	}

	public void forgetPassword() {
		
		clickButton(forgetPasswordLink);
		
	}
	
   public void userLogout() {
		
		//clickButton(logoutLink);
		
	}
}
