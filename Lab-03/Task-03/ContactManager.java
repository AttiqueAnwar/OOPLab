import java.util.*;

public class ContactManager {
    int contactsCount;
    ArrayList<Contacts> myContacts = new ArrayList<Contacts>();

    public void addContacts(Contacts contact) {
        myContacts.add(contact);
        contactsCount++;
    }

    public boolean searchContacts(String searchName) {
        for (Contacts name : myContacts) {
            if (name.getName().equals(searchName)) {
                System.out.println("Name : " + " " + name.getName());
                System.out.println("number :" + " " + name.getphoneNumber());
                return true;
            }
        }
        System.out.println("Contact Not Found");
        return false;
    }

    public boolean removeContacts(String name) {

        for (Contacts c1 : myContacts) {
            if (c1.getName().equals(name)) {
                myContacts.remove(c1);
                System.out.println(c1.getName() + " has been removed.");
                return true;
            }
        }
        System.out.println("Contact Not Deleted");
        return false;
    }
}