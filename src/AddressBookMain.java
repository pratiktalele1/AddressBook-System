
public class AddressBookMain {

	//getting command line arguments
	public static void main(String[] args) {
		Person person = new Person();
		int i = 0;

		//setting value to variables
		person.setFirstName(args[i++]);
		person.setLastName(args[i++]);
		person.setAddress(args[i++]);
		person.setCityName(args[i++]);
		person.setStateName(args[i++]);
		person.setZipCode(args[i++]);
		person.setPhoneNumber(args[i++]);
		person.setEmailAddress(args[i++]);

		//displaying person contact
		System.out.println("first Name ::" + person.getFirstName() + " Last Name ::" + person.getLastName()
				+ " address ::" + person.getAddress() + " city Name ::" + person.getCityName() + "\nstate Name ::"
				+ person.getStateName() + " zip ::" + person.getZipCode() + " phone ::" + person.getPhoneNumber()
				+ " email ::" + person.getEmailAddress());
	}

}
