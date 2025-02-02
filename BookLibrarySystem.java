class Book {
    public String ISBN;
    protected String title;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    public void displayInfo() {
        ISBN = "978-3-16-148410-0";
        title = "Java Programming Basics";
        setAuthor("Ashish Singh");
        System.out.println("ISBN " + ISBN);
        System.out.println("Title " + title);
        System.out.println("Author " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.displayInfo();
    }
}

