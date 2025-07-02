package Day2_Java_Constructors;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available: " + title);
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The Alchemist", "Paulo Coelho", 15.0);
        book.display();
        book.borrowBook();
        book.display();
        book.borrowBook();  // Try borrowing again
    }
}

