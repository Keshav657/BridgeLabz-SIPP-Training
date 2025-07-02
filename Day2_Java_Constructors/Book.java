package Day2_Java_Constructors;

class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("1984", "George Orwell", 9.99);
        defaultBook.displayBook();
        customBook.displayBook();
    }
}

