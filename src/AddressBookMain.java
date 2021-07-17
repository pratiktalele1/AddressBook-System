import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Utility.utilityForContact;

public class AddressBookMain {

	// getting command line arguments
	public static void main(String[] args) throws IOException, ParseException {

		//add atleast one detail
		Person person = new Person();
		person.setValue();
		person.addDetails();

		int checkInput = 1;

		while (checkInput != 0) {

			System.out.println("1-add person\t2-read details\t3-update details\t4-detele details");
			System.out.print("Enter option- ");
			Scanner scanInput = new Scanner(System.in);
			int getUserInput = scanInput.nextInt();

			//checking for option
			switch (getUserInput) {
			case 1: {
				person.setValue();
				person.addDetails();
				break;
			}
			case 2: {
				person.readDetails();
				break;
			}
			case 3: {
				person.updateDetails();
				break;
			}
			case 4: {
				person.deleteContact();

				break;
			}
			}

			//for repetation of directory
			System.out.print("Want to repeat :: ");
			Scanner scanInput2 = new Scanner(System.in);
			checkInput = scanInput2.nextInt();

		}

	}

}
