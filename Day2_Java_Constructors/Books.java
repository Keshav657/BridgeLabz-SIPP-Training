package Day2_Java_Constructors;

class Books {
    public String ISBN;
    protected String title;
    private String author;

    public Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Books {
    String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Format: " + format + ", Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("123-456", "Digital Java", "Tom", "PDF");
        ebook.displayDetails();
    }
}

