/*//////////////////////
 * Name: Joseph Kawamoto
 * Professor: Tanisha Jacks
 * Class: CS-320 
 * Date: 11/12/2023
 */////////////////////

package contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String homeAddress;
	private static AtomicLong idGenerator = new AtomicLong();
	
	//Constructor
	
	public Contact(String firstName, String lastName, String phoneNumber, String homeAddress) {
		
		//contactID
		//A new contact ID is generated, and the new ID number is incremented from the last one
		this.contactID = String.valueOf(idGenerator.getAndIncrement());
		
		//firstName
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		}
		else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		}
		else {
			this.firstName = firstName;			
		}
		
		//lastName 
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		}
		else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		}
		else {
			this.lastName = lastName;
		}
		
		//phoneNumber
		if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() > 10) {
			this.phoneNumber = "0000000000";
		}
		else {
			this.phoneNumber = phoneNumber;
		}
		
		//homeAddress
		if (homeAddress == null || homeAddress.isEmpty()) {
			this.homeAddress = "NULL";
		}
		else {
			this.homeAddress = homeAddress;
		}
	}
	
	//Getters
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getHomeAddress() {
		return homeAddress;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		}
		else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		}
		else {
			this.firstName = firstName;
		}
	}
	
	public void setLastName (String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		}
		else if (lastName.length() > 10) {
			this.lastName.substring(0, 10);
		}
		else {
			this.lastName = lastName;
		}
	}
	
	public void setPhoneNumber (String phoneNumber) {
		if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() != 10) {
			this.phoneNumber = "0000000000";
		}
		else {
			this.phoneNumber = phoneNumber;
		}
	}
	
	public void setHomeAddress (String homeAddress) {
		if (homeAddress == null || homeAddress.isEmpty()) {
			this.homeAddress = "NULL";
		}
		else if (homeAddress.length() > 50) {
			this.homeAddress.substring(0, 50);
		}
		else {
			this.homeAddress = homeAddress;
		}
	}
}
	


