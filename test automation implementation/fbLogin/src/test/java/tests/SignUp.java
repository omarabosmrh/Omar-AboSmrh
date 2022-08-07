package tests;

import org.testng.annotations.Test;

import pages.Home;
import pages.UserRegistrationPage;
import pages.loginPage;

public class SignUp extends TestBase {

	loginPage login;
	Home home;
	UserRegistrationPage signup;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() throws InterruptedException {

		login = new loginPage(driver);
		driver.navigate().to("https://www.facebook.com/signup");
		signup = new UserRegistrationPage(driver);
		signup.userRegisteration("ahmed", "omar", "testttmailll@gmail.com", "testttmaill@gmail.com", "!2345678");

		// Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your
		// registration completed"));
		// home= new Home(driver);
		// home.userLogout();
		driver.close();

	}

}
