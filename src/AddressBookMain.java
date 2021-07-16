import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Utility.utilityForContact;

public class AddressBookMain {

	// getting command line arguments
	public static void main(String[] args) {

		
		Person person = new Person();
		
		// setting value to variables
		person.setValue();
		person.setObj(person);

		Person person1 = new Person();

		// setting value to variables
		person1.setValue();

		// displaying details
		System.out.println("details ::\n" + person.toString());
		System.out.println("details ::\n" + person1.toString());
		person.getObj();

	}

}
