package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import contact.ContactService;

public class ContactServiceTest {

    @Test
    @DisplayName("Test to Update First Name.")
    void testUpdateFirstName() {
        ContactService service = new ContactService();
        service.addContact("Joseph", "Kawamoto", "8081234567", "Kukui Road");
        service.updateFirstName("Joe", "0");
        service.displayContactList();
        assertEquals("Joe", service.getContact("0").getFirstName(), "First name was not updated.");
    }

    @Test
    @DisplayName("Test to Update Last Name.")   
    void testUpdateLastName() {
        ContactService service = new ContactService();
        service.addContact("Joseph", "Kawamoto", "8081234567", "Kukui Road");
        service.updateLastName("Joe", "0");
        service.displayContactList();
        assertEquals("Joe", service.getContact("0").getLastName(), "Last name was not updated.");
    }

    @Test
    @DisplayName("Test to update phone number.")
    void testUpdatePhoneNumber() {
        ContactService service = new ContactService();
        service.addContact("Joseph", "Kawamoto", "8081234567", "Kukui Road");
        service.updatePhoneNumber("8087654321", "0");
        assertEquals("8087654321", service.getContact("0").getPhoneNumber(), "Phone number was not updated.");
    }

    @Test
    @DisplayName("Test to update address.")
    void testUpdateAddress() {
        ContactService service = new ContactService();
        service.addContact("Joseph", "Kawamoto", "8081234567", "Kukui Road");
        service.updateHomeAddress("Not Kukui Road", "0");
        service.displayContactList();
        assertEquals("Not Kukui Road", service.getContact("0").getHomeAddress(), "Address was not updated.");
    }

    @Test
    @DisplayName("Test to ensure that service correctly deletes contacts.")
    void testDeleteContact() {
        ContactService service = new ContactService();
        service.addContact("Joseph", "Kawamoto", "8081234567", "Kukui Road");
        service.deleteContact("0");
        service.displayContactList();
        assertTrue(service.contactList.isEmpty(), "The contact was not deleted.");
    }

    @Test
    @DisplayName("Test to ensure that service can add a contact.")
    void testAddContact() {
        ContactService service = new ContactService();
        service.addContact("Joseph", "Kawamoto", "8081234567", "Kukui Road");
        service.displayContactList();
        assertNotNull(service.getContact("0"), "Contact was not added correctly.");
    }
}
