package Linked_List;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList {
    private MovieNode head;
    private MovieNode tail;

    // Add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // Remove by Movie Title
    public void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println("Found: " + temp.title + " (" + temp.year + "), Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found for director: " + director);
    }

    // Search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Found: " + temp.title + " (" + temp.year + "), Director: " + temp.director);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with rating: " + rating);
    }

    // Display all movies forward
    public void displayForward() {
        MovieNode temp = head;
        System.out.println("Movies (Forward):");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movies reverse
    public void displayReverse() {
        MovieNode temp = tail;
        System.out.println("Movies (Reverse):");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update rating by Movie Title
    public boolean updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

// Demo
public class MovieDoublyLinkedListDemo {
    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        list.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtEnd("The Matrix", "Lana Wachowski", 1999, 8.7);
        list.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);
        list.displayForward();

        System.out.println("\nUpdating rating for 'The Matrix'...");
        list.updateRating("The Matrix", 9.0);
        list.displayForward();

        System.out.println("\nSearching for movies by director 'Christopher Nolan'...");
        list.searchByDirector("Christopher Nolan");

        System.out.println("\nSearching for movies with rating 8.6...");
        list.searchByRating(8.6);

        System.out.println("\nRemoving 'Inception'...");
        list.removeByTitle("Inception");
        list.displayForward();

        System.out.println("\nDisplay movies in reverse order:");
        list.displayReverse();
    }
}
