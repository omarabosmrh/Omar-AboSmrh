package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import org.testng.annotations.Test;

import data.jsonReader;
import pages.loginPage;

public class userRegeisterationWithDDTFileJson extends TestBase {

	loginPage login;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() throws IOException, ParseException {

		jsonReader jReader = new jsonReader();
		jReader.JsonReader();
		login = new loginPage(driver);
		login = new loginPage(driver);
		login.userLogin(jReader.email, jReader.password);
		// Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));

		// registerobject.userLogout();

	}

}
