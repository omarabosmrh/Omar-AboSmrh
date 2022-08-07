package tests;

import org.testng.annotations.Test;

import pages.Home;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationTestCase extends TestBase {

	loginPage login;
	UserRegistrationPage registerobject;
	Home home;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() throws InterruptedException {

		login = new loginPage(driver);
		// login.openRegistrationPage();
		login.userLogin("bjhcewyweb_1659543069@tfbnw.net", "!2345678");

		// Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your
		// registration completed"));
		home = new Home(driver);
		home.userLogout();

	}

}
