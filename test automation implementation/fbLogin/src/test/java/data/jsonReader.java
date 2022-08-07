package data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonReader {

	public String email, password, email2, password2, email3, password3;

	public void JsonReader() throws IOException, ParseException {
		String filePath = System.getProperty("user.dir") + "/src/test/java/data/fb.json";

		File srcFile = new File(filePath);

		JSONParser parser = new JSONParser();
		JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcFile));

		for (Object jsonObj : jarray) {
			JSONObject person = (JSONObject) jsonObj;
			email = (String) person.get("email");
			System.out.println(email);

			password = (String) person.get("password");
			System.out.println(password);

			email2 = (String) person.get("email2");
			System.out.println(email2);

			password2 = (String) person.get("password2");
			System.out.println(password2);

			email3 = (String) person.get("email3");
			System.out.println(email3);

			password3 = (String) person.get("password3");
			System.out.println(password3);
		}

	}

}
