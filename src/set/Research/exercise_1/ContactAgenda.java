package set.Research.exercise_1;

import java.util.HashSet;
import java.util.Set;

public class ContactAgenda {

    private Set<Contact> contactSet;
    
    public ContactAgenda() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int phoneNumber) {
        contactSet.add(new Contact(name, phoneNumber));
    }

    public void displayContacts() {

        if(contactSet.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println(contactSet);
        }

    }

    public Set<Contact> searchByName(String name) {

        if(!contactSet.isEmpty()) {
            
            Set<Contact> contactsByName = new HashSet<>();

            for(Contact c : contactSet) {

                if(c.getName().startsWith(name)) {
                    contactsByName.add(c);
                }
                
            }

            return contactsByName;

        } else {
            throw new RuntimeException("The set is empty.");
        }

    }

    public void updateContactNumber(String name, int newNumber) {

        if(!contactSet.isEmpty()) {
            
            Contact updateContact = null;

            for(Contact c : contactSet) {

                if(c.getName().equalsIgnoreCase(name)) {
                    c.setNumber(newNumber);
                    updateContact = c;
                    break;
                }

            }

            if(updateContact == null) {
                System.out.println("This contact is not in the agenda.");
            } else {
                System.out.println("Contact updated successfully.");
            }

        } else {
            System.out.println("The set is empty.");
        }

    }

}
