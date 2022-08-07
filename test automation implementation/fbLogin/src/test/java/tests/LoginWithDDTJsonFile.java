package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.jsonReader;
import pages.loginPage;

public class LoginWithDDTJsonFile extends TestBase {

	loginPage login;

	@Test(priority = 1, alwaysRun = true)
	public void userCanLoginSuccessfullyWithValidData() throws IOException, ParseException {

		jsonReader jReader = new jsonReader();
		jReader.JsonReader();
		login = new loginPage(driver);

		login = new loginPage(driver);
		login.userLogin(jReader.email, jReader.password);
		// Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));
		// driver.close();
	}

	@Test(priority = 2, alwaysRun = true)
	public void userCanNotLoginSuccessfullyWithINValidData() throws IOException, ParseException {

		jsonReader jReader = new jsonReader();
		jReader.JsonReader();
		login = new loginPage(driver);

		login = new loginPage(driver);
		login.userLogin(jReader.email2, jReader.password2);
		// Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));
		// driver.close();
	}

	@Test(priority = 3, alwaysRun = true)
	public void userCanNotLoginSuccessfullyWithEmptyData() throws IOException, ParseException {

		jsonReader jReader = new jsonReader();
		jReader.JsonReader();
		login = new loginPage(driver);

		login = new loginPage(driver);
		login.userLogin(jReader.email3, jReader.password3);
		// Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));
		// driver.close();
	}

}
