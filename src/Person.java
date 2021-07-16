import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Utility.utilityForContact;

public class Person {
	//person contact fields
	private String firstName;
	private String lastName;
	private String address;
	private String cityName;
	private String stateName;
	private String zipCode;
	private String phoneNumber;
	private String emailAddress;
	public ArrayList<Object> contactDetails=new ArrayList<Object>();

		
	//getter and setter for contact 
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
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", cityName="
				+ cityName + ", stateName=" + stateName + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber
				+ ", emailAddress=" + emailAddress + "]";
	}
	
	public void setObj(Person per) {
		contactDetails.add(per);
	}
	
	public void getObj() {
		System.out.println(contactDetails.get(0));
	}
	
	
}
