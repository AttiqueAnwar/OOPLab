public class Author {
    private String name;
    private String email;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    Author() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void display() {
        System.out.println("Name: " + name + " Email: " + email);
    }

    boolean updateEmail(String newEmail) {
        this.email = newEmail;
        return true;
    }
}