package contact;

import java.util.ArrayList;

public class ContactService {
	
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t ContactID: " + contactList.get(counter).getContactID());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getPhoneNumber());
			System.out.println("\t Home Address: " + contactList.get(counter).getHomeAddress());
			System.out.println();
		}
	}
	
	public void addContact(String firstName, String lastName, String phoneNumber, String homeAddress) {
		Contact contact = new Contact(firstName, lastName, phoneNumber, homeAddress);
		contactList.add(contact);
	}
	
	public Contact getContact(String contactID) {
		Contact contact = new Contact(null, null, null, null);
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().contentEquals(contactID)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}
	
	public void deleteContact(String contactID) {
		for (int counter = 0; counter < contactList.size(); counter ++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.remove(counter);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " was not found.");
			}
		}
	}
	
	public void updateFirstName(String newFirstName, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setFirstName(newFirstName);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " was not found.");
			}
		}
	}
	
	public void updateLastName(String newLastName, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setLastName(newLastName);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " was not found.");
			}
		}
	}
	
	public void updatePhoneNumber(String newPhoneNumber, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setPhoneNumber(newPhoneNumber);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " was not found.");
			}
		}
	}
	
	public void updateHomeAddress(String newHomeAddress, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setHomeAddress(newHomeAddress);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " was not found.");
			}
		}
	}
	
}



