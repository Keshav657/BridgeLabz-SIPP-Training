package Day4_Object_Oriented_Design_Practises;

import java.util.*;

class Book {
    String title, author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();
    public Library(String name) {
        this.name = name;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void showBooks() {
        System.out.println(name + " Library contains:");
        for (Book b : books) b.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "James");
        Book b2 = new Book("Python", "Guido");
        
        Library lib1 = new Library("City");
        Library lib2 = new Library("College");

        lib1.addBook(b1);
        lib2.addBook(b1);
        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}

