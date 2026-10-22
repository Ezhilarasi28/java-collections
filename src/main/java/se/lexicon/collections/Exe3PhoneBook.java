


package se.lexicon.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Exe3PhoneBook {

    void main() {

        Scanner userInput = new Scanner(System.in);

        // Step 1: Call the method to create phone book
        HashMap<String, String> phoneBookApp = createPhoneBook();

        // Step 2: Ask the user for a name
        IO.print("Enter contact name: ");
        String name = userInput.nextLine().trim();

        // Step 3: Search contact (case-insensitive)
        boolean found = false;

        for (String contactName : phoneBookApp.keySet()) {
            if (contactName.equalsIgnoreCase(name)) {
                IO.println("Phone number: " + phoneBookApp.get(contactName));
                found = true;
                break;
            }
        }

        if (!found) {
            IO.println("Contact not found.");
        }

    } // main method ends

    // Step 4: Create phone book method for JUnit testing
    public HashMap<String, String> createPhoneBook() {

        HashMap<String, String> phoneBookApp = new HashMap<>();

        phoneBookApp.put("Anu", "0701234567");
        phoneBookApp.put("Priya", "0702345678");
        phoneBookApp.put("Ravi", "0703456789");
        phoneBookApp.put("Sara", "0704567890");

        return phoneBookApp;
    }

} //class end
