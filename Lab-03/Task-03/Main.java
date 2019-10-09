public class Main {
    public static void main(String[] args) {
        ContactManager myContactsManager = new ContactManager();
        Contacts sameer = new Contacts("Sameer", "12345");
        myContactsManager.addContacts(sameer);
        Contacts myContact2 = new Contacts();
        myContact2.setName("waqar");
        myContact2.setphoneNumber("456321");
        myContactsManager.addContacts(myContact2);
        Contacts myContact3 = new Contacts();
        myContact3.setName("umer");
        myContact3.setphoneNumber("7856654");
        myContactsManager.addContacts(myContact3);
        boolean result = myContactsManager.searchContacts("Sameer");
        // System.out.println(result.getphoneNumber());
        boolean result2 = myContactsManager.removeContacts("waqar");
        boolean result3 = myContactsManager.searchContacts("waqar");

    }
}