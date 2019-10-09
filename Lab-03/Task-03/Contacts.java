public class Contacts {
    String name;
    String phoneNumber;

    Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    Contacts() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

}
