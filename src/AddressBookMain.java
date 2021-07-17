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

		// add atleast one detail
		Person person = new Person();
		person.setValue();
		person.addDetails("./src/contactDetails.json");

		int checkInput = 1;

		while (checkInput != 0) {

			System.out.print("by default first directory enter 1 or 2 directory- ");
			Scanner scanInput3 = new Scanner(System.in);
			int checkDirectory = scanInput3.nextInt();
			System.out.println("no is-" + checkDirectory);

			if (checkDirectory == 1) {

				System.out.println("welcome to first directory");
				System.out.println("1-add person\t2-read details\t3-update details\t4-detele details");
				System.out.print("Enter option- ");
				Scanner scanInput = new Scanner(System.in);
				int getUserInput = scanInput.nextInt();

				// checking for option
				switch (getUserInput) {
				case 1: {
					person.setValue();
					person.addDetails("./src/contactDetails.json");
					break;
				}
				case 2: {
					person.readDetails("./src/contactDetails.json");
					break;
				}
				case 3: {
					person.updateDetails("./src/contactDetails.json");
					break;
				}
				case 4: {
					person.deleteContact("./src/contactDetails.json");

					break;
				}
				}

				// for repetation of directory
				System.out.print("Want to repeat :: ");
				Scanner scanInput2 = new Scanner(System.in);
				checkInput = scanInput2.nextInt();
			} else {
				//adding another directory
				System.out.println("welcome to second directory");
				System.out.println("1-add person\t2-read details\t3-update details\t4-detele details");
				System.out.print("Enter option- ");
				Scanner scanInput = new Scanner(System.in);
				int getUserInput = scanInput.nextInt();

				// checking for option
				switch (getUserInput) {
				case 1: {
					person.setValue();
					person.addDetails("./src/anotherDetails");
					break;
				}
				case 2: {
					person.readDetails("./src/anotherDetails");
					break;
				}
				case 3: {
					person.updateDetails("./src/anotherDetails");
					break;
				}
				case 4: {
					person.deleteContact("./src/anotherDetails");

					break;
				}
				}

				// for repetation of directory
				System.out.print("Want to repeat :: ");
				Scanner scanInput2 = new Scanner(System.in);
				checkInput = scanInput2.nextInt();
			}
		}
	}

}
