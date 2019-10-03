public class Book {
    private String title;
    private Author author;
    private double price;
    private int quantity;

    Book(String title, Author author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;

    }

    Book() {
    }

    public void setName(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void display() {
        System.out.println(
                "Title: " + title + " Author: " + author.getName() + " Price: " + price + " Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Book[] book = new Book[4];
        Author a1 = new Author("Amna", "amna@bajwa.com");
        book[0] = new Book("The Power", a1, 0, 100);
        Author a2 = new Author("Robin Sharma", "robin@sharma.com");
        book[1] = new Book("The Monk", a2, 200, 100);
        book[2] = new Book();
        book[3] = new Book();
        Author a3 = new Author();
        a3.setName("poulo choelo");
        a3.setEmail("abc@gmail.com");
        book[2].setName("Alchemist");
        book[2].setAuthor(a3);
        book[2].setPrice(100000);
        book[2].setQuantity(90);
        book[3].setName("The Spy");
        book[3].setAuthor(a3);
        book[3].setPrice(200);
        book[3].setQuantity(0);

        for (int i = 0; i < 4; i++) {
            book[i].display();
        }
    }
}