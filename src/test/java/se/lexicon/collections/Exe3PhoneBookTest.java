

package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class Exe3PhoneBookTest {

    Exe3PhoneBook phoneBookApp = new Exe3PhoneBook();

    @Test
    @DisplayName("Verify that four contacts are stored")
    void testPhoneBookSize() {

        HashMap<String, String> contacts = phoneBookApp.createPhoneBook();

        assertEquals(4, contacts.size());
    }

    @Test
    @DisplayName("Verify that Anu exists")
    void testContactExists() {

        HashMap<String, String> contacts = phoneBookApp.createPhoneBook();

        assertTrue(contacts.containsKey("Anu"));
    }

    @Test
    @DisplayName("Verify Priya's phone number")
    void testCorrectPhoneNumber() {

        HashMap<String, String> contacts = phoneBookApp.createPhoneBook();

        assertEquals("0702345678", contacts.get("Priya"));
    }

    @Test
    @DisplayName("Verify unknown contact is not found")
    void testContactNotFound() {

        HashMap<String, String> contacts = phoneBookApp.createPhoneBook();

        assertFalse(contacts.containsKey("Kumar"));
        assertNull(contacts.get("Kumar"));
    }

    @Test
    @DisplayName("Verify all four contacts are stored")
    void testAllContacts() {

        HashMap<String, String> contacts = phoneBookApp.createPhoneBook();

        assertAll(
                () -> assertEquals("0701234567", contacts.get("Anu")),
                () -> assertEquals("0702345678", contacts.get("Priya")),
                () -> assertEquals("0703456789", contacts.get("Ravi")),
                () -> assertEquals("0704567890", contacts.get("Sara"))
        );
    }
}
