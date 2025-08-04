package Inheritance;

// Superclass
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Demo
public class LibraryManagement {
    public static void main(String[] args) {
        Author a1 = new Author("Effective Java", 2018, "Joshua Bloch", "Expert in Java and software engineering.");
        Author a2 = new Author("Clean Code", 2008, "Robert C. Martin", "Known for software craftsmanship and agile development.");

        a1.displayInfo();
        System.out.println("---");
        a2.displayInfo();
    }
}
