// Build an Address Book Management System that stores contact details such as name, phone number, and email address. Design the application using multiple Java Collections to achieve efficient storage, searching, and duplicate prevention. Your progran should support the following functionalities:

// Store all contacts in an ArrayList to maintain an ordered list. - Use a HashMapcString, Contact> for quick lookup of contacts by name.

// - Use a HashSet<String> to ensure that duplicate phone nunbers cannot be added.

// - Implement functionality to add, search, delete, and display contacts. - Display all contacts sorted alphabetically by name using Collections.sort().

// - Ensure that whenever a contact is added or deleted, all three collections remain synchronized

// and contain consistent data.
package senario_based_question;

import java.util.*;

public class addressBookManagement {

    // Contact Class
    static class Contact {
        String name;
        String phone;
        String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String toString() {
            return "Name : " + name +
                    " | Phone : " + phone +
                    " | Email : " + email;
        }
    }

    // Collections
    ArrayList<Contact> contactList = new ArrayList<>();
    HashMap<String, Contact> contactMap = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    // Add Contact
    public void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contactList.add(c);
        contactMap.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    // Search Contact
    public void searchContact(String name) {

        if (contactMap.containsKey(name)) {
            System.out.println(contactMap.get(name));
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    // Delete Contact
    public void deleteContact(String name) {

        if (!contactMap.containsKey(name)) {
            System.out.println("Contact Not Found.");
            return;
        }

        Contact c = contactMap.get(name);

        contactList.remove(c);
        contactMap.remove(name);
        phoneSet.remove(c.phone);

        System.out.println("Contact Deleted Successfully.");
    }

    // Display Contacts
    public void displayContacts() {

        Collections.sort(contactList, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareTo(c2.name);
            }
        });

        System.out.println("\n----- Contact List -----");

        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        addressBookManagement obj = new addressBookManagement();

        // Add Contacts
        obj.addContact("Krishna", "9876543210", "krishna@gmail.com");
        obj.addContact("Aman", "9876543200", "aman@gmail.com");
        obj.addContact("Rohit", "9876543299", "rohit@gmail.com");

        // Duplicate Phone Number
        obj.addContact("Ram", "9876543210", "ram@gmail.com");

        // Search Contact
        System.out.println("\nSearching Aman...");
        obj.searchContact("Aman");

        // Display Contacts
        obj.displayContacts();

        // Delete Contact
        System.out.println("\nDeleting Aman...");
        obj.deleteContact("Aman");

        // Display Again
        obj.displayContacts();
    }
}