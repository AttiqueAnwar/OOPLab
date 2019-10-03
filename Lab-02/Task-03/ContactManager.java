class ContactManager {
    int contactsCount = 0;
    Contacts[] myContacts = new Contacts[500];

    void addContacts(Contacts contact) {
        myContacts[contactsCount] = contact;
        contactsCount++;
    }

    Contacts searchContacts(String name) {
        for (int i = 0; i < contactsCount; i++) {
            String objName = myContacts[i].getName();
            if (objName.equals(name)) {
                return myContacts[i];
            }
        }
        return null;
    }
}
