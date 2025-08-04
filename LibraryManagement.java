package Encap_Poly;
import java.util.ArrayList;

// Reservable interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract LibraryItem class
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private String borrower; // Encapsulated personal data

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
    }

    // Encapsulation: Getters and Setters
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getBorrower() { return borrower; }
    protected void setBorrower(String borrower) { this.borrower = borrower; }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author + (borrower != null ? ", Borrower: " + borrower : "");
    }
}

// Book subclass
class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 21 days for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        setBorrower(borrowerName);
        System.out.println("Book reserved for " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}

// Magazine subclass
class Magazine extends LibraryItem implements Reservable {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days for magazines
    }

    @Override
    public void reserveItem(String borrowerName) {
        setBorrower(borrowerName);
        System.out.println("Magazine reserved for " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}

// DVD subclass
class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        setBorrower(borrowerName);
        System.out.println("DVD reserved for " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}

// Utility class for polymorphism
class LibraryUtils {
    public static void showAllItems(ArrayList<LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                System.out.println("Available: " + (((Reservable)item).checkAvailability() ? "Yes" : "No"));
            }
            System.out.println("---");
        }
    }
}

// Demo
public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1, "Java Programming", "James Gosling"));
        items.add(new Magazine(2, "Tech Monthly", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        ((Reservable)items.get(0)).reserveItem("Alice");
        ((Reservable)items.get(2)).reserveItem("Bob");
        LibraryUtils.showAllItems(items);
    }
}


