import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Utility.utilityForContact;

public class Person {
	// person contact fields
	private String firstName;
	private String lastName;
	private String address;
	private String cityName;
	private String stateName;
	private String zipCode;
	private String phoneNumber;
	private String emailAddress;

	JSONObject completeRecord = new JSONObject();

	// getter and setter for contact
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setValue() {
		System.out.print("first Name - ");
		setFirstName(utilityForContact.getInput());

		System.out.print("Last Name - ");
		setLastName(utilityForContact.getInput());

		System.out.println("address -");
		setAddress(utilityForContact.getInput());

		System.out.println("city name -");
		setCityName(utilityForContact.getInput());

		System.out.println("state name -");
		setStateName(utilityForContact.getInput());

		System.out.println("zip -");
		setZipCode(utilityForContact.getInput());

		System.out.println("phone -");
		setPhoneNumber(utilityForContact.getInput());

		System.out.println("email -");
		setEmailAddress(utilityForContact.getInput());
	}

	//adding details for phone directory
	public void addDetails() throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("first", firstName);
		jsonObject.put("last", lastName);
		jsonObject.put("address", address);
		jsonObject.put("city", cityName);
		jsonObject.put("email", emailAddress);
		jsonObject.put("phone", phoneNumber);
		jsonObject.put("state", stateName);
		jsonObject.put("zip", zipCode);

		JSONArray insert = new JSONArray();
		insert.add(jsonObject);

		completeRecord.put(firstName, insert);

		FileWriter fw = new FileWriter("./src/contactDetails.json");
		fw.write(completeRecord.toJSONString());
		fw.flush();
		fw.close();

	}

	//read details from phone directory
//	public void readDetails() throws FileNotFoundException, IOException, ParseException {
//		System.out.print("Enter name to read details- ");
//		Scanner scanInput = new Scanner(System.in);
//		String getInput = scanInput.next();
//		this.firstName=getInput;
//		JSONParser jsonParser = new JSONParser();
//		JSONObject jo = (JSONObject) jsonParser.parse(new FileReader("./src/contactDetails.json"));
//
//		for (int i = 0; i <= jo.size(); i++) {
//
//			JSONArray array = (JSONArray) jo.get(firstName);
//			System.out.println(array.get(i));
//			break;
//
//		}
//	}

	//update details from phone directory
	public void updateDetails() throws IOException, ParseException {
		
		System.out.print("Enter name to update details- ");
		Scanner scanInput12 = new Scanner(System.in);
		String getName = scanInput12.next();
		this.firstName=getName;
		
		JSONParser jsonParser = new JSONParser();
		JSONObject jo = (JSONObject) jsonParser.parse(new FileReader("./src/contactDetails.json"));

		System.out.print("1-first name\n" + "2-last name" + "3-address" + "4-city" + "5-email" + "6-phone" + "7-state"
				+ "8-zip");

		Scanner scanInput = new Scanner(System.in);
		int option = scanInput.nextInt();

		switch (option) {
		case 1: {
			for (int i = 0; i < jo.size(); i++) {

				JSONArray array = (JSONArray) jo.get(firstName);
				System.out.println(array.get(i));

				JSONObject getValue = (JSONObject) array.get(i);
				getValue.get("first");

				System.out.print("Enter - ");
				Scanner scanInput1 = new Scanner(System.in);
				String getUserInput = scanInput1.nextLine();
				getValue.put("first", getUserInput);
				break;
			}
			break;
		}
		case 2: {
			for (int i = 0; i < jo.size(); i++) {

				JSONArray array = (JSONArray) jo.get(firstName);
				System.out.println(array.get(i));

				JSONObject getValue = (JSONObject) array.get(i);
				getValue.get("last");

				System.out.print("Enter - ");
				Scanner scanInput1 = new Scanner(System.in);
				String getUserInput = scanInput1.nextLine();
				getValue.put("last", getUserInput);
			}
			break;
		}
		case 3: {
			for (int i = 0; i < jo.size(); i++) {

				JSONArray array = (JSONArray) jo.get("person1");
				System.out.println(array.get(i));

				JSONObject getValue = (JSONObject) array.get(i);
				getValue.get("address");

				System.out.print("Enter - ");
				Scanner scanInput1 = new Scanner(System.in);
				String getUserInput = scanInput1.nextLine();
				getValue.put("address", getUserInput);
			}
			break;
		}
		case 4: {
			for (int i = 0; i < jo.size(); i++) {

				JSONArray array = (JSONArray) jo.get("person1");
				System.out.println(array.get(i));

				JSONObject getValue = (JSONObject) array.get(i);
				getValue.get("city");

				System.out.print("Enter - ");
				Scanner scanInput1 = new Scanner(System.in);
				String getUserInput = scanInput1.nextLine();
				getValue.put("city", getUserInput);
			}
			break;
		}
		case 5: {
			for (int i = 0; i < jo.size(); i++) {

				JSONArray array = (JSONArray) jo.get("person1");
				System.out.println(array.get(i));

				JSONObject getValue = (JSONObject) array.get(i);
				getValue.get("email");

				System.out.print("Enter - ");
				Scanner scanInput1 = new Scanner(System.in);
				String getUserInput = scanInput1.nextLine();
				getValue.put("email", getUserInput);
			}
			break;
		}
		case 6: {
			for (int i = 0; i < jo.size(); i++) {

				JSONArray array = (JSONArray) jo.get("person1");
				System.out.println(array.get(i));

				JSONObject getValue = (JSONObject) array.get(i);
				getValue.get("phone");

				System.out.print("Enter - ");
				Scanner scanInput1 = new Scanner(System.in);
				String getUserInput = scanInput1.nextLine();
				getValue.put("phone", getUserInput);
			}
			break;
		}
		case 7: {
			for (int i = 0; i < jo.size(); i++) {

				JSONArray array = (JSONArray) jo.get("person1");
				System.out.println(array.get(i));

				JSONObject getValue = (JSONObject) array.get(i);
				getValue.get("state");

				System.out.print("Enter - ");
				Scanner scanInput1 = new Scanner(System.in);
				String getUserInput = scanInput1.nextLine();
				getValue.put("state", getUserInput);
			}
			break;
		}
		case 8: {
			for (int i = 0; i < jo.size(); i++) {

				JSONArray array = (JSONArray) jo.get("person1");
				System.out.println(array.get(i));

				JSONObject getValue = (JSONObject) array.get(i);
				getValue.get("zip");

				System.out.print("Enter - ");
				Scanner scanInput1 = new Scanner(System.in);
				String getUserInput = scanInput1.nextLine();
				getValue.put("zip", getUserInput);
			}
			break;
		}
		}

		FileWriter fc = new FileWriter("./src/contactDetails.json");
		fc.write(jo.toJSONString());
		fc.flush();
		fc.close();

	}
	
	//deleting details from phone directory
//	public void deleteContact() throws FileNotFoundException, IOException, ParseException {
//		System.out.print("Enter name to delete details- ");
//		Scanner scanInput = new Scanner(System.in);
//		String getInput = scanInput.next();
//		this.firstName=getInput;
//		
//		JSONParser jsonParser = new JSONParser();
//		JSONObject jo = (JSONObject) jsonParser.parse(new FileReader("./src/contactDetails.json"));
//
//		for (int i = 0; i <= jo.size(); i++) {
//
//			JSONArray array = (JSONArray) jo.remove(firstName);
//			FileWriter fc = new FileWriter("./src/contactDetails.json");
//			fc.write(jo.toJSONString());
//			fc.flush();
//			fc.close();
//			
//			break;
//
//		}
//
//	}

}
