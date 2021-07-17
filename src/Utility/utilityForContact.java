package Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class utilityForContact {
	public static String getInput() {
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.nextLine();
		return getUserInput;
	}
	
	public static void changeValue(String getVal) throws FileNotFoundException, IOException, ParseException {
		JSONObject completeRecord = new JSONObject();
		JSONParser jsonParser = new JSONParser();
		JSONObject jo = (JSONObject) jsonParser.parse(new FileReader("./src/contactDetails.json"));
		
		for (int i = 0; i < jo.size(); i++) {

			JSONArray array = (JSONArray) jo.get("person1");
			System.out.println(array.get(i));

			JSONObject getValue = (JSONObject) array.get(i);
			getValue.get(getVal);

			System.out.print("Enter - ");
			Scanner scanInput1 = new Scanner(System.in);
			String getUserInput = scanInput1.nextLine();
			getValue.put(getVal, getUserInput);
		}
		
		FileWriter fc = new FileWriter("./src/contactDetails.json");
		fc.write(jo.toJSONString());
		fc.flush();
		fc.close();

}
}
