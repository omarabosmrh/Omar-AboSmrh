package tests;

import java.io.FileReader;
import java.io.IOException;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationWithDDTCSVFile extends TestBase {

	UserRegistrationPage registerobject;
	loginPage login;
	CSVReader reader;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() throws CsvValidationException, IOException {

		String csv_file = System.getProperty("user.dir") + "/src/test/java/data/fb.csv";
		reader = new CSVReader(new FileReader(csv_file));
		String[] csvCell;
		while ((csvCell = reader.readNext()) != null) {

			String email = csvCell[0];
			String password = csvCell[1];
			login = new loginPage(driver);
			login.userLogin(email, password);

			// registerobject = new UserRegistrationPage(driver);
			// registerobject.userRegisteration(firstName, lastName,email,password);
			// Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your
			// registration completed"));
			// registerobject.userLogout();

			// homeopject.openLoginPage();
			// loginOpject = new loginPage(driver);
			// loginOpject.userLogin(email, password);
			// Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));

			// registerobject.userLogout();

		}

	}

}
