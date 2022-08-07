package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegistrationPage extends pageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}
	// find all input required

	////
	@FindBy(name = "firstname")
	WebElement firstName;

	@FindBy(name = "lastname")
	WebElement lastName;

	@FindBy(name = "reg_email__")
	WebElement regEmail;

	@FindBy(name = "reg_email_confirmation__")
	WebElement emailConfirm;

	@FindBy(id = "password_step_input")
	WebElement newPassword;

	@FindBy(id = "day")
	WebElement selectDay;

	@FindBy(id = "month")
	WebElement selectMonth;

	@FindBy(id = "year")
	WebElement selectYear;

	@FindBy(css = "label._58mt")
	WebElement gender;

	@FindBy(name = "websubmit")
	WebElement signupBTN;

	@FindBy(className = "uiHeaderTitle")
	public WebElement headerAssert;

	public void userRegisteration(String firstname, String lastname, String email,String emailconfirm,  String password)
			throws InterruptedException {

		setTextElement(firstName, firstname);
		setTextElement(lastName, lastname);
		setTextElement(regEmail, email);
		setTextElement(emailConfirm, emailconfirm);
		setTextElement(newPassword, password);

		select = new Select(selectDay);
		select.selectByVisibleText("6");
		Thread.sleep(2000);

		select = new Select(selectMonth);
		select.selectByVisibleText("Jun");
		Thread.sleep(2000);

		select = new Select(selectYear);
		select.selectByVisibleText("1994");
		Thread.sleep(2000);

		clickButton(gender);

		clickButton(signupBTN);
	}
	
public void openSignup() {
		
		driver.navigate().to("www.facebook.com/signup");
		
		
	}


public void signupForm(String firstname, String lastname, String email,  String password)
		throws InterruptedException {

	setTextElement(firstName, firstname);
	setTextElement(lastName, lastname);
	setTextElement(regEmail, email);
	//setTextElement(emailConfirm, emailconfirm);
	setTextElement(newPassword, password);

	select = new Select(selectDay);
	select.selectByVisibleText("6");
	Thread.sleep(2000);

	select = new Select(selectMonth);
	select.selectByVisibleText("Jun");
	Thread.sleep(2000);

	select = new Select(selectYear);
	select.selectByVisibleText("1994");
	Thread.sleep(2000);

	clickButton(gender);

	clickButton(signupBTN);

}



}
