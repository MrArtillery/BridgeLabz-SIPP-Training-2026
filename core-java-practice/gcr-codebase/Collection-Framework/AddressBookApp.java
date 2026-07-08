import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println();
    }
}

public class AddressBookApp {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private HashMap<String, Contact> contactMap = new HashMap<>();
    private HashSet<String> phoneNumbers = new HashSet<>();

    // Add contact
    public void addContact(String name, String phone, String email) {
        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number not allowed: " + phone);
            return;
        }

        Contact contact = new Contact(name, phone, email);
        contacts.add(contact);
        contactMap.put(name, contact);
        phoneNumbers.add(phone);

        System.out.println("Contact added: " + name);
    }

    // Search contact by name
    public void searchContact(String name) {
        if (contactMap.containsKey(name)) {
            System.out.println("\nContact Found:");
            contactMap.get(name).display();
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    // Delete contact by name
    public void deleteContact(String name) {
        Contact contact = contactMap.get(name);

        if (contact == null) {
            System.out.println("Contact not found: " + name);
            return;
        }

        contacts.remove(contact);
        contactMap.remove(name);
        phoneNumbers.remove(contact.phone);

        System.out.println("Contact deleted: " + name);
    }

    // Display all contacts sorted by name
    public void displaySortedContacts() {
        Collections.sort(contacts, (c1, c2) -> c1.name.compareToIgnoreCase(c2.name));

        System.out.println("\nAddress Book (Sorted by Name):");
        for (Contact contact : contacts) {
            contact.display();
        }
    }

    public static void main(String[] args) {
        AddressBookApp app = new AddressBookApp();

        app.addContact("Ankur", "9876543210", "ankur@gmail.com");
        app.addContact("Rahul", "9876501234", "rahul@gmail.com");
        app.addContact("Priya", "9123456789", "priya@gmail.com");

        // Duplicate phone test
        app.addContact("Aman", "9876543210", "aman@gmail.com");

        app.searchContact("Rahul");

        app.deleteContact("Priya");

        app.displaySortedContacts();
    }
}
