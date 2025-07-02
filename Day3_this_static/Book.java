package Day3_this_static;

class Book {
    private String title, author;
    private final String isbn;
    static String libraryName = "Central Library";

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James", "ISBN123");
        Book b2 = new Book("Python Pro", "Guido", "ISBN456");
        b1.displayDetails();
        b2.displayDetails();
        Book.displayLibraryName();
    }
}

