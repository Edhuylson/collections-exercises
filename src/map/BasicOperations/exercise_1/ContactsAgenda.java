package map.BasicOperations.exercise_1;

import java.util.HashMap;
import java.util.Map;

public class ContactsAgenda {
    
    private Map<String, Integer> contacts;

    public ContactsAgenda() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, Integer phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {

        if(!contacts.isEmpty()) {

            Integer removedNumber = contacts.remove(name);

            if(removedNumber == null) {
                System.out.println("Contact not found.");
            } else {
                System.out.println("Contact removed.");
            }
            
        } else {
            System.out.println("The contacts agenda is empty.");
        }

    }

    public void displayContacts() {
        
        if(!contacts.isEmpty()) {
            System.out.println(contacts);
        } else {
            System.out.println("The contacts agenda is empty.");
        }

    }

    public Integer searchByName(String name) {

        if(!contacts.isEmpty()) {

            Integer phoneNumber = null;
            phoneNumber = contacts.get(name);
            return phoneNumber;

        } else {
            throw new RuntimeException("The contacts agenda is empty.");
        }

    }

}
