package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.Home;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationTestCasewithJavaFaker extends TestBase {

	Home home;
	UserRegistrationPage registerobject;
	loginPage login;
	Faker fakeData = new Faker();
	String firstname = fakeData.name().firstName();
	String lastname = fakeData.name().lastName();
	String email = fakeData.internet().emailAddress();
	String password = fakeData.number().digits(8).toString();

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() throws InterruptedException {
		driver.navigate().to("https://www.facebook.com/signup");
		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration(firstname, lastname, email, email, password);
		// Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your
		// registration completed"));
		// registerobject.userLogout();
		Thread.sleep(3000);
		// Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));
		// registerobject.userLogout();
		driver.close();
	}

	@Test(priority = 2, alwaysRun = true)
	public void userCanLoginSuccessfully() throws InterruptedException {
		login = new loginPage(driver);
		login.openLogin();
		login.userLogin(email, password);
		Thread.sleep(3000);
		// Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));
		// registerobject.userLogout();
	}

}