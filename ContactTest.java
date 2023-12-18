package tests;

import org.junit.jupiter.api.Test;

import contact.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

	@Test
	@DisplayName("ContactID cannot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", "HomeAddress");
		if (contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("First Name cannot have more than 10 characters")
	void testContactFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("JosephKawamoto", "LastName", "PhoneNumbr", "HomeAddress");
		if (contact.getFirstName().length() > 10) {
			fail("First Name has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("Last Name cannot have more than 10 characters")
	void testContactLastNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "JosephKawamoto", "PhoneNumbr", "HomeAddress");
		if (contact.getLastName().length() > 10) {
			fail("Last Name has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("Phone number is exactly 10 characters")
	void testContactNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "0000000000", "HomeAddress");
		if (contact.getPhoneNumber().length() != 10) {
			fail("Phone number length does not equal 10.");
		}
	}

	@Test
	@DisplayName("Home Address cannot have more than 50 characters")
	void testContactHomeAddressWithMoreThanFiftyCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr",
				"1234567891011121314151617181920212223242526272829");
		if (contact.getHomeAddress().length() > 50) {
			fail("Address has more than 50 characters.");
		}
	}

	@Test
	@DisplayName("Contact First Name shall not be null")
	void testContactFirstNameNotNull() {
		Contact contact = new Contact(null, "LastName", "PhoneNumbr", "HomeAddress");
		assertNotNull(contact.getFirstName(), "First name is null.");
	}

	@Test
	@DisplayName("Contact Last Name shall not be null")
	void testContactLastNameNotNull() {
		Contact contact = new Contact("FirstName", null, "PhoneNumbr", "HomeAddress");
		assertNotNull(contact.getLastName(), "Last name is null.");
	}

	@Test
	@DisplayName("Contact Phone Number shall not be null")
	void testContactPhoneNumerNotNull() {
		Contact contact = new Contact("FirstName", "LastName", null, "HomeAddress");
		assertNotNull(contact.getPhoneNumber(), "Phone number is null.");
	}

	@Test
	@DisplayName("Contact Address shall not be null")
	void testContactAddressNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", null);
		assertNotNull(contact.getHomeAddress(), "Address is null.");
	}
}

