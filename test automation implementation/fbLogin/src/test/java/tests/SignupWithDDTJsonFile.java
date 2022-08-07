package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import data.jsonSignupReader;
import pages.UserRegistrationPage;

public class SignupWithDDTJsonFile extends TestBase {

	UserRegistrationPage signup;

	@Test(priority = 1, alwaysRun = true)
	public void userCanLoginSuccessfully() throws IOException, ParseException, InterruptedException {

		jsonSignupReader jReader = new jsonSignupReader();
		jReader.JsonReader();
		signup = new UserRegistrationPage(driver);

		signup = new UserRegistrationPage(driver);
		signup.signupForm(jReader.firstname, jReader.lastname, jReader.email, jReader.password);
		// Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));
		// driver.close();
	}

}
